package org.rupesh.easy;

import java.util.Arrays;

public class _01_MergeSortedArray {
    public static void main(String[] args) {
        int[] numberArray1 = {1, 2, 3, 0, 0, 0}, numberArray2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(numberArray1, m, numberArray2, n);
        System.out.println(Arrays.toString(numberArray1));
    }

    public static void merge(int[] numberArray1, int m, int[] numberArray2, int n) {
        //if numberArray1 is empty, copy from numberArray2
        if (m == 0 && n > 0) {
            System.arraycopy(numberArray2, 0, numberArray1, 0, n);
        } else if (n != 0) {
            int index = n + m - 1, left = m - 1, right = n - 1;
            while ((left >= 0 && right >= 0) && index >= 0) {
                if (numberArray1[left] > numberArray2[right]) numberArray1[index--] = numberArray1[left--];
                else {
                    numberArray1[index--] = numberArray2[right--];
                }
            }
            //copy remaining elements from  numberArray2, if any:
            if (left < 0) {
                if (index + 1 >= 0) System.arraycopy(numberArray2, 0, numberArray1, 0, index + 1);
            }
        }
    }
}
