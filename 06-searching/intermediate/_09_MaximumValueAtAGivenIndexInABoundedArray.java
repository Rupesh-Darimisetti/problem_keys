package intermediate;

/**
 * You are given three positive integers: n, index, and maxSum. You want to construct an array numberArray (0-indexed)
 * that satisfies the following conditions: numberArray.length == n numberArray[i] is a positive integer where 0 <= i <
 * n. abs(numberArray[i] - numberArray[i+1]) <= 1 where 0 <= i < n-1. The sum of all the elements of numberArray does
 * not exceed maxSum. numberArray[index] is maximized. Return numberArray[index] of the constructed array. Note that
 * abs(x) equals x if x >= 0, and -x otherwise. Explanation: numberArray = [1,2,2,1] is one array that satisfies all the
 * conditions. There are no arrays that satisfy all the conditions and have numberArray[2] == 3, so 2 is the maximum
 * numberArray[2].
 */
public class _09_MaximumValueAtAGivenIndexInABoundedArray {
    public static void main(String[] args) {
        int n = 4, index = 2, maxSum = 6;
        int result = maxValue(n, index, maxSum);
        System.out.println(result);
    }

    private static int maxValue(int n, int index, int maxSum) {
        int left = 0, right = maxSum - n;

        while (left < right) {
            int middle = (left + right + 1) / 2;
            if (isPossible(n, index, maxSum - n, middle)) {
                left = middle;
            } else {
                right = middle - 1;
            }
        }
        return left + 1;
    }

    private static boolean isPossible(int n, int index, int maxSum, int value) {
        int leftValue = Math.max(value - index, 0);
        int rightValue = Math.max(value - ((n - 1) - index), 0);

        long sumBefore = (long) (value + leftValue) * (value - leftValue + 1) / 2;
        long sumAfter = (long) (value + rightValue) * (value - rightValue + 1) / 2;

        return sumBefore + sumAfter - value <= maxSum;
    }
}
