package easy;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return
 * the index where it would be if it were inserted in order.
 */
public class _09_SearchInsertPosition {
    public static void main(String[] args) {
        int[] number = {1, 3, 5, 6};
        int target = 7;
        int searchInsertResult = searchInsert(number, target);
        System.out.println(searchInsertResult);
    }

    private static int searchInsert(int[] numberArray, int target) {
        int start = 0;
        int end = numberArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numberArray[mid] > target) {
                end = mid - 1;
            } else if (numberArray[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
