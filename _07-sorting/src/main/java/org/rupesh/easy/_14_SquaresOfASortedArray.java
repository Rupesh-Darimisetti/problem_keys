package org.rupesh.easy;

import java.util.Arrays;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class _14_SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] numberArray = {-7, -3, 2, 3, 11}; // Output: [4,9,9,49,121]
        int[] sortedArr = sortedSquares(numberArray);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortedSquares(int[] numberArray) {
        int len = numberArray.length;
        for (int num = 0; num < len; num++) {
            // squaring of values
            numberArray[num] = numberArray[num] * numberArray[num];
        }

        // insertion sort 315ms
        for (int pass = 0; pass < len - 1; pass++) {
            for (int val = pass + 1; val > 0; val--) {
                if (numberArray[val] < numberArray[val - 1]) {
                    swap(numberArray, val, val - 1);
                } else {
                    break;
                }
            }
        }
        return numberArray;
    }

    public static void swap(int[] arr, int oldIndex, int newIndex) {
        int bufferStorage = arr[oldIndex];
        arr[oldIndex] = arr[newIndex];
        arr[newIndex] = bufferStorage;
    }
}