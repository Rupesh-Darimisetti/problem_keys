package org.rupesh.easy;

import java.util.Arrays;

public class _21_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] numberArray = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(numberArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumbersThanCurrent(int[] numberArray) {
        int len = numberArray.length; // total length of elements
        int[] ans = new int[len]; // new array for storing the no of small nos present in the array after the no itself
        int count = 0;
        for (int presentVal = 0; presentVal < len; presentVal++) {
            count = 0;
            for (int nextVal = 0; nextVal < len; nextVal++) {
                if (presentVal != nextVal) {
                    if (numberArray[presentVal] > numberArray[nextVal]) {
                        count++;
                    }
                }
            }
            ans[presentVal] = count;
        }
        return ans;
    }
}