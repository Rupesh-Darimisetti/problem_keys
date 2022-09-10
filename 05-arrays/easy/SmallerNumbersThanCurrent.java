package easy;

import java.util.Arrays;
// 8. How Many Numbers Are Smaller Than the Current Number
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        System.out.println("Program to print How Many Numbers Are Smaller Than the Current Number");
        int[] nums = {6,5,4,8};
        int[] smallerNumbersArray =smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(nums) + "\t==>\t" + Arrays.toString(smallerNumbersArray));
        int[] nums1 = {8,1,2,2,3};
        smallerNumbersArray =smallerNumbersThanCurrent(nums1);
        System.out.println(Arrays.toString(nums1) + "\t==>\t" + Arrays.toString(smallerNumbersArray));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int count, min;
        for (int val = 0; val < len; val++) {
            min = nums[val];
            count = 0;
            for (int num: nums) if (min > num) count++;
            arr[val] = count;
        }
        return arr;
    }
}
