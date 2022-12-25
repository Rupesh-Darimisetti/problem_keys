package org.rupesh.easy;

public class _07_ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] numberArray = {2, 2, 3, 1};
        int max = thirdMax(numberArray);
        System.out.println(max);
    }


    public static int thirdMax(int[] numberArray) {
        int index = 0;
        int len = numberArray.length;
        // bubble sorting applied
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (numberArray[i] < numberArray[j]) {
                    swap(numberArray, i, j);
                }
            }
        }
        int maxValPos = 1;
        for (int pos = len - 2; pos >= 0; pos--) {
            if (numberArray[pos] != numberArray[pos + 1]) {
                maxValPos++;
            }
            if (maxValPos == 3) {
                return numberArray[pos];
            }
        }
        return numberArray[numberArray.length - 1];
    }

    public static void swap(int[] numberArray, int start, int end) {
        // swapping of values from one place to another place
        int temp = numberArray[start];
        numberArray[start] = numberArray[end];
        numberArray[end] = temp;
    }
}
