package hard;

//https://leetcode.com/problems/split-array-largest-sum/description/
public class _05_SplitArrayLargestSum {
//    static int[] numberArray;

    public static void main(String[] args) {
        int[] numberArray = {7, 2, 5, 10, 8};
        int k = 2;
        int result = splitArray(numberArray, k);
        System.out.println(result);
    }

    private static int splitArray(int[] numberArray, int k) {
        if (numberArray == null || numberArray.length == 0) return 0;
        int max = 0;
        int sum = 0;
        for (int i : numberArray) {
            if (i > max) max = i;
            sum += i;
        }
        return (int) binarySearch(max, sum, numberArray, k);
    }

    private static long binarySearch(long left, long right, int[] numberArray, int m) {
        while (left <= right) {
            long middle = left + (right - left) / 2;
            if (isValid(middle, numberArray, m)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private static boolean isValid(long targetCap, int[] numberArray, int m) {
        int currSum = 0;
        int partitionsCount = 1;
        for (int i : numberArray) {
            currSum += i;
            if (currSum > targetCap) {
                currSum = i;
                partitionsCount++;
                if (partitionsCount > m) {
                    return false;
                }
            }
        }
        return true;
    }
}
