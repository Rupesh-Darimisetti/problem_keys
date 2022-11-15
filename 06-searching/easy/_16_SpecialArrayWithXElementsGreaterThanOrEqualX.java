package easy;

class _16_SpecialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        int noOfElements = specialArray(nums);
        System.out.println(noOfElements);
    }
    private static int specialArray(int[] nums) {
        int start = 0;
        int end = nums.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= mid) {
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