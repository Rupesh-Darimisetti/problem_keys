package hard;

// https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
public class _01_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] numberArray1 = {1, 2}, numberArray2 = {3, 4};
        double median = findMedianSortedArrays(numberArray1, numberArray2);
        System.out.println(median);
    }

    private static double findMedianSortedArrays(int[] numberArray1, int[] numberArray2) {
        int lenNumber1 = numberArray1.length, lenNumber2 = numberArray2.length;
        if (lenNumber2 < lenNumber1) {
            return findMedianSortedArrays(numberArray2, numberArray1);
        }

        int start = 0, end = lenNumber1;
        int median = (lenNumber1 + lenNumber2 + 1) / 2;

        while (start <= end) {
            int midOfArray1 = start + (end - start) / 2;
            int midOfArray2 = median - midOfArray1;

            int leftArray1 = (midOfArray1 == 0) ? Integer.MIN_VALUE : numberArray1[midOfArray1 - 1];
            int leftArray2 = (midOfArray2 == 0) ? Integer.MIN_VALUE : numberArray2[midOfArray2 - 1];
            int rightArray1 = (midOfArray1 == lenNumber1) ? Integer.MAX_VALUE : numberArray1[midOfArray1];
            int rightArray2 = (midOfArray2 == lenNumber2) ? Integer.MAX_VALUE : numberArray2[midOfArray2];

            if (leftArray1 <= rightArray2 && leftArray2 <= rightArray1) {
                return (lenNumber1 + lenNumber2) % 2 == 0 ?
                        (Math.max(leftArray1, leftArray2) + Math.min(rightArray1, rightArray2)) / 2.0 :
                        Math.max(leftArray1, leftArray2);
            } else if (leftArray2 > rightArray1) {
                start = midOfArray1 + 1;
            } else {
                end = midOfArray1 - 1;
            }
        }
        return 0.0;
    }
}
