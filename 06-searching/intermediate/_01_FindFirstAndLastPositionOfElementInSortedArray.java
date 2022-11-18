package intermediate;

import java.util.Arrays;

public class _01_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] numberArray = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(numberArray, target);
        System.out.println(Arrays.toString(result));
    }

    private static int findStartIndex(int[] numberArray, int start, int end, int target) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numberArray[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (numberArray[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int findEndIndex(int[] numberArray, int start, int end, int target) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numberArray[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (numberArray[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static int[] searchRange(int[] numberArray, int target) {
        int start = 0;
        int end = numberArray.length - 1;
        int[] ans = new int[2];
        ans[0] = findStartIndex(numberArray, start, end, target);
        ans[1] = findEndIndex(numberArray, start, end, target);
        return ans;
    }
}
