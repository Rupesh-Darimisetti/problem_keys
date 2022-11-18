package intermediate;

public class _02_SingleElementIinASortedArray {
    public static void main(String[] args) {
        int[] numberArray = {1, 1, 2, 2, 3}; // output: 3
        int result = singledNonDuplicate(numberArray);
        System.out.println(result);
    }

    private static int singledNonDuplicate(int[] numberArray) {
        int end = numberArray.length - 1;
        int start = 0;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if ((mid % 2 == 0 && numberArray[mid] == numberArray[mid + 1]) ||
                    (mid % 2 == 1 && numberArray[mid] == numberArray[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return numberArray[start];
    }
}
