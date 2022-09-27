package easy;

import java.util.Arrays;

public class _27_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[]  nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(nums);
        int[] res = new int[ans];
        int j = 0;
        for (int val = 0; val < ans; val++) {
            if (nums[val] != nums[val+1]) {
                res[j] = nums[val];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int j = 0;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j] = nums[nums.length-1];
        j++;
        return j;
    }
}
