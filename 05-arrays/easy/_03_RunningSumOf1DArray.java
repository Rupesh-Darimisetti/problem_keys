package easy;

import java.util.Arrays;

// 3. Running Sum of 1d Array
public class _03_RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int[] runningSum = runningSum(num);
        System.out.println(Arrays.toString(runningSum));
    }

    private static int[] runningSum(int[] numberArray) {
        int len = numberArray.length;
        int[] number = new int[len];
        int sum = 0;
        for (int val = 0; val < len; val++) {
            sum = sum + numberArray[val];
            number[val] = sum;
        }
        return number;
    }
}

