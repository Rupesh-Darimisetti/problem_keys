package easy;

public class _24_MaximumSubArray {
    public static void main(String[] args) {
        int[] numberArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSubArray(numberArray);
        System.out.println(ans);
        numberArray = new int[]{5, 4, -1, 7, 8};
        ans = maxSubArray(numberArray);
        System.out.println(ans);
    }

    private static int maxSubArray(int[] numberArray) {
        int len = numberArray.length;
        int res = numberArray[0], max = numberArray[0];
        for (int i = 1; i < len; i++) {
            int num = numberArray[i];
            max = Math.max(max + num, num);
            res = Math.max(res, max);
        }
        return res;
    }
}
