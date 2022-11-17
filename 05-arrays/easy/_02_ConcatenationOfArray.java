package easy;

import java.util.Arrays;

// 2. Concatenation of Array
public class _02_ConcatenationOfArray {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 1};
        int[] ans = getConcatenation(numberArray);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] numberArray) {
        int len = numberArray.length, new_len = 2 * len;
        int[] number = new int[new_len];
        for (int val = 0; val < len; val++) {
            number[val] = numberArray[val];
            number[val + len] = numberArray[val];
        }
        return number;
    }
}
