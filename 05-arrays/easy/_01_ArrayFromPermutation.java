package easy;

import java.util.Arrays;

// 1. Build Array from Permutation
public class _01_ArrayFromPermutation {
    public static void main(String[] args) {
        int[] numberArray = {0, 2, 1, 5, 3, 4};
        int[] num = buildArray(numberArray);
        System.out.println(Arrays.toString(num));
    }

    public static int[] buildArray(int[] numberArray) {
        int[] number = new int[numberArray.length];
        for (int val = 0; val < numberArray.length; val++) number[val] = numberArray[numberArray[val]];
        return number;
    }
}
