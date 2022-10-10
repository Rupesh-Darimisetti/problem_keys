package medium;

import java.util.Arrays;

public class _8_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
    private static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] arr = new int[len];
        for(int i = 0; i< len; i++){
            arr[(i+k)%len] = nums[i];
        }
        System.arraycopy(arr, 0, nums, 0, len);
        System.out.println(Arrays.toString(nums));
    }
}
