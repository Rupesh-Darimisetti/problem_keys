package easy;

import java.util.Arrays;

public class _26_PlusOne {
    public static void main(String[] args) {
        int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] ans = plusOne(num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int carry = 0;
        if (digits[n] == 9) {
            digits[n] = 0;
            carry = 1;
        } else {
            digits[n] = digits[n] + 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9 && carry == 1) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
            }
        }
        if (carry == 1) {
            int[] ans = new int[n + 2];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, n + 1);
            return ans;
        }
        return digits;
    }
}
