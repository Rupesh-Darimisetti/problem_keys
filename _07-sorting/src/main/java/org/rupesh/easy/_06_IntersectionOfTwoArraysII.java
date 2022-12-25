package org.rupesh.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] numberArray1 = {1,2,2,1}, numberArray2 = {2,2};
        int[] res = intersect(numberArray1, numberArray2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] intersect(int[] numberArray1, int[] numberArray2) {
        // sort the arrays
        sort(numberArray1);
        sort(numberArray2);

        int s1 = 0, s2 = 0;

        List<Integer> ans = new ArrayList<>();

        int lastIndex = -1;

        while (s1 < numberArray1.length && s2 < numberArray2.length) {
            // declares variables for the values in that index
            int val1 = numberArray1[s1];
            int val2 = numberArray2[s2];

            if (val1 < val2) {
                s1++;
            } else if (val1 > val2) {
                s2++;
            } else {
                // adds common numbers present in the arrays
                    ans.add(val1);
                s1++;
                s2++;
            }
        }

        int[] res = new int[ans.size()];
        int index = ans.size() - 1;
        while (ans.size() != 0) {
            res[index] = ans.remove(index--);
        }
//        int index =0;
//        for(int num : ans){
//            res[index++] = num;
//        }
        return res;
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
