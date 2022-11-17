package easy;

import java.util.Arrays;

public class _21_TwoSum {
    public static void main(String[] args) {
        int[] numberArray = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(numberArray, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] numberArray, int target) {
        int len = numberArray.length;
        int[] arr = new int[2];
        for (int row = 0; row < len; row++) {
            for (int element = row + 1; element < len; element++) {
                if (numberArray[row] + numberArray[element] == target) {
                    arr[0] = row;
                    arr[1] = element;
                }
            }
        }
        return arr;
    }
}
