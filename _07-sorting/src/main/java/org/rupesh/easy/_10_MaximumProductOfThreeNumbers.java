package org.rupesh.easy;

public class _10_MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] numberArray = {-100, -98, -1, 2, 3, 4};
        int product = maximumProduct(numberArray);
        System.out.println(product);
    }

    public static int maximumProduct(int[] arr) {
        sort(arr);
        int num = 0, num1 = 0;
        num = arr[0] * arr[1] * arr[arr.length - 1];
        num1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        return Math.max(num, num1);
    }

    private static void sort(int[] numberArray) {
        // Insertion sort applied
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (numberArray[j] < numberArray[j - 1]) {
                    swap(numberArray, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] numberArray, int index, int correct) {
        int temp = numberArray[index];
        numberArray[index] = numberArray[correct];
        numberArray[correct] = temp;
    }
}
