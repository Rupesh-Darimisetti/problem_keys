package easy;

import java.util.Arrays;

public class _27_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] numberArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ans = removeDuplicates(numberArray);
        int[] res = new int[ans];
        int j = 0;
        for (int val = 0; val < ans; val++) {
            if (numberArray[val] != numberArray[val + 1]) {
                res[j] = numberArray[val];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    private static int removeDuplicates(int[] numberArray) {
        if (numberArray.length == 0 || numberArray.length == 1) {
            return numberArray.length;
        }

        int j = 0;
        for (int i = 0; i < numberArray.length - 1; i++) {
            if (numberArray[i] != numberArray[i + 1]) {
                numberArray[j] = numberArray[i];
                j++;
            }
        }
        numberArray[j] = numberArray[numberArray.length - 1];
        j++;
        return j;
    }
}
