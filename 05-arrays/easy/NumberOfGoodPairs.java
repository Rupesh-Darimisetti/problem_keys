package easy;
// 7. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int noOfGreatPairs = numberOfGoodPairs(nums);
        System.out.println(noOfGreatPairs);
        int[] num = {1, 1, 1, 1};
        noOfGreatPairs = numberOfGoodPairs(num);
        System.out.println(noOfGreatPairs);
    }
    public  static  int numberOfGoodPairs(int[] nums){
        int len = nums.length;
        int count = 0;
        for(int row = 0; row < len; row++) {
            for (int col = 0; col < len; col++) {
                if (row < col && nums[row] == nums[col]) count++;
            }
        }
        return count;
    }
}
