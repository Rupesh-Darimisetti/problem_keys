package org.rupesh.easy;

import java.util.Arrays;

public class _17_RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {}, arr2 = {};
        int[] res = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pos = 0;
        for (int num : arr2) {
            for (int j = pos; j < arr1.length; j++) {
                if (arr1[j] == num) {
                    swap(arr1, j, pos);
                    pos++;
                }
            }
        }
        sort(arr1, pos, arr1.length - 1);
        return arr1;
    }

    public static void sort(int[] arr, int low, int high) {

        if (low > high) {
            return;
        }

        int start = low;
        int end = high;
        int middle = (end - start) / 2 + start;
        int pivot = arr[middle];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        sort(arr, low, end);
        sort(arr, start, high);
    }

    public static void swap(int[] arr, int start, int pos) {
        int buffer = arr[start];
        arr[start] = arr[pos];
        arr[pos] = buffer;
    }
}
