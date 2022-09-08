package easy;

import java.util.Arrays;
// 1. Build Array from Permutation
public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums ={0,2,1,5,3,4};
        int[] num = buildArray(nums);
        System.out.println(Arrays.toString(num));
    }
    public static int[] buildArray(int[] nums) {
        int[] number = new int[nums.length];
        for(int val =0 ; val < nums.length;val++) number[val] = nums[nums[val]];
        return number;
    }
}
