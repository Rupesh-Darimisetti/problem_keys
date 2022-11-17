package medium;

import java.util.Arrays;

public class _8_RotateArray {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(numberArray, k);
    }

    private static void rotate(int[] numberArray, int k) {
        int len = numberArray.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[(i + k) % len] = numberArray[i];
        }
        System.arraycopy(arr, 0, numberArray, 0, len);
        System.out.println(Arrays.toString(numberArray));
    }
}
