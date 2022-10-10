package medium;

public class _7_JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        boolean canJump = canJump(nums);
        System.out.println(canJump);
    }
    private static boolean canJump(int[] nums) {
        int len = nums.length;
        int curr = 0;
        for(int i = 0; i < len; i++){
            if (i > curr)
                return false;
            curr = Math.max(curr, i + nums[i]);
        }
        return true;
    }
}
