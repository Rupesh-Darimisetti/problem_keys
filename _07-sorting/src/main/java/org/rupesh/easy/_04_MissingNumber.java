package org.rupesh.easy;

public class _04_MissingNumber {
    public static void main(String[] args) {
        int[] numberArray = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int missingNumber = missingNumber(numberArray);
        System.out.println(missingNumber);
    }

    public static int missingNumber(int[] numberArray) {
        int index = 0;
        while (index < numberArray.length) {
            int correct = numberArray[index];
            // check the index value is less than length and value at index is in correct position if not swap values
            if ((numberArray[index] < numberArray.length) && (numberArray[index] != numberArray[correct])) {
                swap(numberArray, index, correct);
            } else {
                index++;
            }
        }
        // check each element and index value matches
        for (int pos = 0; pos < numberArray.length; pos++) {
            if (numberArray[pos] != pos) {
                return pos;
            }
        }
        return numberArray.length;
    }

    public static void swap(int[] numberArray, int start, int end) {
        // Swapping of variables from one place to another.
        int temp = numberArray[start];
        numberArray[start] = numberArray[end];
        numberArray[end] = temp;
    }
}