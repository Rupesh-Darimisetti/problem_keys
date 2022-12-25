package org.rupesh.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] numberArray1 = {4, 9, 5}, numberArray2 = {9, 4, 9, 8, 4};
        int[] result = intersection(numberArray1, numberArray2);
        System.out.println(Arrays.toString(result));
    }

    private static void sort(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < numberArray.length; j++) {
                if (numberArray[j] < numberArray[j - 1]) {
                    swap(numberArray, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] numberArray, int start, int end) {
        int temp = numberArray[start];
        numberArray[start] = numberArray[end];
        numberArray[end] = temp;
    }

    public static int[] intersection(int[] numberArray1, int[] numberArray2) {
        sort(numberArray1);
        sort(numberArray2);
        System.out.println(Arrays.toString(numberArray1));
        System.out.println(Arrays.toString(numberArray2));
        int s1 = 0, s2 = 0;
        List<Integer> ans = new ArrayList<>();
        int lastIndex = -1;
        while (s1 < numberArray1.length && s2 < numberArray2.length) {
            int val1 = numberArray1[s1];
            int val2 = numberArray2[s2];

            if (val1 < val2) s1++;
            else if (val1 > val2) s2++;
            else {
                if (lastIndex != val1) {
                    ans.add(val1);
                    lastIndex = val1;
                }
                s1++;
                s2++;
            }
        }
        System.out.println(ans);
        int[] res = new int[ans.size()];
        int i = ans.size() - 1;
        while (ans.size() != 0) {
            res[i] = ans.remove(i--);
        }
        return res;
    }
}
