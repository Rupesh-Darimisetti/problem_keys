package intermediate;

/**
 * Given a 0-indexed integer array numberArray, find a peak element, and return its index. If the array contains
 * multiple peaks, return the index to any of the peaks. You may imagine that numberArray[-1] = numberArray[n] = -&infin;. In
 * other words, an element is always considered to be strictly greater than a neighbor that is outside the array. You
 * must write an algorithm that runs in O(log n) time.
 */
public class _06_FindPeakElement {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 1, 3, 5, 6, 4}; //  OUTPUT: index 5 for element 6
        int peakElementIndex = findPeakElement(numberArray);
        System.out.println(peakElementIndex);
    }

    private static int findPeakElement(int[] numberArray) {
        int start = 0, end = numberArray.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (numberArray[mid] >= numberArray[mid + 1]) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}
