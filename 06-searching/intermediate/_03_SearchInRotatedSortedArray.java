package intermediate;

public class _03_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] numberArray = {4, 5, 6, 7, 0, 1, 2}; // output: location index - 4
        int target = 0;
        int result = search(numberArray, target);
        System.out.println(result);
    }

    private static int search(int[] numberArray, int target) {
        int left = 0;
        int right = numberArray.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numberArray[mid] == target) return mid;
            //  search left sorted array
            if (numberArray[left] <= numberArray[mid]) {
                if (target >= numberArray[left] && target <= numberArray[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //  search right sorted array
                if (target >= numberArray[mid] && target <= numberArray[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
