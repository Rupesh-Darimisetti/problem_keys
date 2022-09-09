package easy;

import java.util.ArrayList;
import java.util.List;
// 6. KidsWiththeGreatestNumberofCandies
public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] nums ={2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(nums, extraCandies);
        System.out.println(ans);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0, len = candies.length, val;
        for(val = 0; val< len;val++){
            if(candies[val]>max)
                max = candies[val];
        }
        List<Boolean> result = new ArrayList<>(len);
        for(val = 0; val < len; val++){
            if(candies[val] + extraCandies >=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
