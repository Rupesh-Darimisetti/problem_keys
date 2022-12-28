package org.rupesh.easy;

import java.util.Arrays;

//https://leetcode.com/problems/sort-array-by-parity-ii/
public class _12_SortArrayByParityII {
    public static void main(String[] args) {
        int[] numberArray = {4, 2, 5, 7};
        int[] eveOddArray = sortArrayByParityII(numberArray);
        System.out.println(Arrays.toString(eveOddArray));
    }

    public static int[] sortArrayByParityII(int[] numberArray) {
        int len = numberArray.length;
        int[] arr = new int[len];
        int evenIndex = 0;
        int oddIndex = 1;
        for (int num : numberArray) {
            if (num % 2 == 0) {
                arr[evenIndex] = num;
                evenIndex += 2;
            }
            if (num % 2 != 0) {
                arr[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return arr;
    }
}
