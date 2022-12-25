package org.rupesh.easy;

import java.util.Arrays;

public class _11_SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] res = sortArrayByParity(nums);
        System.out.println(Arrays.toString(res));
    }
    public  static int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int[] arr = new int[len];
        int i = 0;

        int j = arr.length -1;
        for(int num : nums){
            if(num % 2  ==0){
                arr[i] = num;
                 i++;
            } if(num % 2  !=0){
                arr[j] = num;
                j--;
            }
        }
        return arr;
    }
}
