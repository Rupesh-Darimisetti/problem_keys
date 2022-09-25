package easy;

public class _24_MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
        nums = new int[]{5, 4, -1, 7, 8};
        ans = maxSubArray(nums);
        System.out.println(ans);
    }
    private static int maxSubArray(int[] nums) {
        int len = nums.length;
        int res = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            max = Math.max(max + num, num);
            res = Math.max(res, max);
        }
        return  res;
    }
}
