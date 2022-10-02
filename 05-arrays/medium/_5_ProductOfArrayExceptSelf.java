package medium;

import java.util.Arrays;

public class _5_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] productExceptSelf(int[] nums) {
        int prod = 1, flag = 0;
        int len = nums.length;
        for(int num :nums){
            if(num == 0){
                flag++;
                continue;
            }
            prod  *= num;

        }
        for(int i = 0; i < len; i++){
                nums[i] = flag == 0 ? prod / nums[i] : flag != 1 ? 0 : nums[i] != 0 ? 0 : prod;
        }


        return nums;
    }
}
