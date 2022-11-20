package intermediate;

public class _04_SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] numberArray = {2,5,6,0,0,1,2};
        int target = 0;
        boolean result = search(numberArray, target);
        System.out.println(result);
    }

    private static boolean search(int[] numberArray, int target) {
        int left = 0;
        int right = numberArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numberArray[mid] == target) {
                return true;
            }
            // with duplicates, we can have this condition, just update left & right
            if ((numberArray[left] == numberArray[mid]) && (numberArray[right] == numberArray[mid])) {
                left++;
                right--;
            }
            // first half
            //  is in order
            else if (numberArray[left] <= numberArray[mid]) {
                // target is in first  half
                if ((numberArray[left] <= target) && (numberArray[mid] > target)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // second half
            //  is order
            // target is in second half
            else {
                if ((numberArray[mid] < target) && (numberArray[right] >= target)) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
