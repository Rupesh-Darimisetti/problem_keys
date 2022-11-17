package easy;

class _16_SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        int[] numberArray = {0, 4, 3, 0, 4};
        int noOfElements = specialArray(numberArray);
        System.out.println(noOfElements);
    }

    private static int specialArray(int[] numberArray) {
        int start = 0;
        int end = numberArray.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int num : numberArray) {
                if (num >= mid) {
                    count++;
                }
            }
            if (mid == count) return mid;
            else if (mid < count) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}