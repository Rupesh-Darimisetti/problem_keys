package easy;

import java.util.Arrays;

// 5. Shuffle the Array
// Input: numberArray = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]
public class _05_ShuffleTheArray {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] ans = shuffleThePuzzle(numberArray, n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] shuffleThePuzzle(int[] numberArray, int n) {
        int[] arr = new int[2 * n];
        for (int index = 0; index < n; index++) {
            arr[2 * index] = numberArray[index];
            arr[2 * index + 1] = numberArray[n + index];
        }
        return arr;
    }
}
