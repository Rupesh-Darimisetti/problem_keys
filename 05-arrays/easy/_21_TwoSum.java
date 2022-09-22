package easy;

import java.util.Arrays;

public class _21_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    private static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] arr = new int[2];
        for (int row = 0; row < len; row++) {
            for (int element = row + 1; element < len; element++) {
                if (nums[row] + nums[element] == target){
                    arr[0] = row;
                    arr[1] = element;
                }
            }
        }
        return arr;
    }
}
