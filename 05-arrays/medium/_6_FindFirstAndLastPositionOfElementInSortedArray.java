package medium;

import java.util.Arrays;

public class _6_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] numberArray = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] res = searchRange(numberArray, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] searchRange(int[] numberArray, int target) {
        int first = 0;
        int last = numberArray.length - 1;
        int[] arr = new int[2];
        arr[0] = firstIndex(first, last, numberArray, target);
        arr[1] = lastIndex(first, last, numberArray, target);
        return arr;
    }

    private static int firstIndex(int first, int last, int[] numberArray, int target) {
        int ans = -1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (numberArray[mid] == target) {
                ans = mid;
                last = mid - 1;
            } else if (numberArray[mid] > target) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return ans;
    }

    private static int lastIndex(int first, int last, int[] numberArray, int target) {
        int ans = -1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (numberArray[mid] == target) {
                ans = mid;
                first = mid + 1;
            } else if (numberArray[mid] > target) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return ans;
    }
}
