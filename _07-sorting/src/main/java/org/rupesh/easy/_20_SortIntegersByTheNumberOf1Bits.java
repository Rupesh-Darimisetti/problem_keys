package org.rupesh.easy;

import java.util.Arrays;

public class _20_SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        // output: [1,2,4,8,16,32,64,128,256,512,1024]
        int[] res = sortByBits(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countBitOne(arr[i]) * 10001 + arr[i];
        }

        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            res[i] %= 10001;
        }

        return res;
    }

    private static int countBitOne(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }
}