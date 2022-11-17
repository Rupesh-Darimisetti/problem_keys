package medium;

import java.util.Arrays;

public class _5_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] numberArray = {-1, 1, 0, -3, 3};
        int[] ans = productExceptSelf(numberArray);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] productExceptSelf(int[] numberArray) {
        int prod = 1, flag = 0;
        int len = numberArray.length;
        for (int num : numberArray) {
            if (num == 0) {
                flag++;
                continue;
            }
            prod *= num;

        }
        for (int i = 0; i < len; i++) {
            numberArray[i] = flag == 0 ? prod / numberArray[i] : flag != 1 ? 0 : numberArray[i] != 0 ? 0 : prod;
        }


        return numberArray;
    }
}
