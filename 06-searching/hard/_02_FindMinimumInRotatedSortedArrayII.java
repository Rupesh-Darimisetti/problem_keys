package hard;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class _02_FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] numberArray = {4, 5, 6, 7, 0, 1, 4};
        int min = findMin(numberArray);
        System.out.println(min);
    }

    private static int findMin(int[] numberArray) {
        if (numberArray == null || numberArray.length == 0) {
            return -1;
        }
        int start = 0;
        int end = numberArray.length - 1;
        if (numberArray[start] < numberArray[end]) {
            return numberArray[start];
        }
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (numberArray[mid] == numberArray[start]) {
                // shrink the search space
                start++;
            } else if (numberArray[mid] == numberArray[end]) {
                // shrink the search space
                end--;
            } else if (numberArray[mid] > numberArray[start]) {
                // same idea as case without duplicates
                // find the pivot where original array rotates
                start = mid;
            } else {
                end = mid;
            }
        }
        return Math.min(numberArray[start], numberArray[end]);
    }
}