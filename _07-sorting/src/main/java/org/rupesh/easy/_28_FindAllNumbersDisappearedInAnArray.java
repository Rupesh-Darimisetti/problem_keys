package org.rupesh.easy;

import java.util.ArrayList;
import java.util.List;

public class _28_FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] numberArray = {4, 3, 2, 7, 8, 2, 3, 1};  //  Output: [5,6]
        List<Integer> res = findDisappearedNumbers(numberArray);
        System.out.println(res);
    }

    private static List<Integer> findDisappearedNumbers(int[] numberArray) {
        int index = 0;
        // cyclic sort
        while (index < numberArray.length) {
            int correct = numberArray[index] - 1;
            if (numberArray[index] != numberArray[correct]) {
                swap(numberArray, index, correct);
            } else {
                index++;
            }
        }
        List<Integer> arr = new ArrayList<>();
        // check each element and index value matches
        for (int pos = 0; pos < numberArray.length; pos++) {
            if (numberArray[pos] != pos + 1) {
                arr.add(pos + 1);
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int oldPos, int newPos) {
        int bufferValue = arr[oldPos];
        arr[oldPos] = arr[newPos];
        arr[newPos] = bufferValue;
    }
}
