package org.rupesh.easy;

public class _27_SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        int[] numberArray = {3, 5};
        int res = specialArray(numberArray);
        System.out.println(res);
    }

    public static int specialArray(int[] numberArray) {
        int start = 0;
        int end = numberArray.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int num : numberArray) {
                if (num >= mid) {
                    count++;
                }
            }
            if (mid == count) {
                return mid;
            } else if (mid < count) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
