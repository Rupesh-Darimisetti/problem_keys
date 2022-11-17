package easy;

import java.util.Arrays;

public class _22_FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        int n = 5;
        int[] ans = sumZero(n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sumZero(int n) {
        int[] arr = new int[n];
        int val;

//        if (n % 2 == 0) {
        val = -n + 1;
        int index = 0;
        while (index < n) {
            arr[index] = val;
            val += 2;
            index++;
        }
//        } else {
//            val = -n / 2;
//            int index = 0;
//            while (index < n) {
//                arr[index] = val++;
//                index++;
//            }
//        }
        return arr;
    }
}
