package org.rupesh.easy;

public class _09_ArrayPartitionI {
    public static void main(String[] args) {
        int[] numberArray = {6, 2, 6, 5, 1, 2};
        int res = arrayPairSum(numberArray);
        System.out.println(res);
    }

    public static int arrayPairSum(int[] numberArray) {
        int len = numberArray.length;
        sort(numberArray);
        int start = 0;
        int end = len - 2;
        int sum = 0;
        while (start < end) {
            sum += numberArray[start] + numberArray[end];
            start += 2;
            end -= 2;
        }
        return (len / 2) % 2 == 0 ? sum : sum + numberArray[start];
    }
    public static void sort(int[] arr) {
        // insertion sort
        for (int noOfPasses = 0; noOfPasses < arr.length - 1; noOfPasses++) {
            for (int val = noOfPasses + 1; val > 0; val--) {
                if (arr[val] < arr[val - 1]) {
                    swap(arr, val, val - 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int oldPos, int newPos) {
        int temp = arr[oldPos];
        arr[oldPos] = arr[newPos];
        arr[newPos] = temp;
    }
}
