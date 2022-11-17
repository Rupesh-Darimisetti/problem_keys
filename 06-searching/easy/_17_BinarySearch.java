package easy;

class _17_BinarySearch {
    public static void main(String[] args) {
        int[] numbersArray = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int targetIndex = search(numbersArray, target);
        System.out.println(targetIndex);
    }

    private static int search(int[] numbersArray, int target) {
        int start = 0, end = numbersArray.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (numbersArray[mid] == target) return mid;
            else if (numbersArray[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}