package medium;

public class _10_HouseRobber {
    public static void main(String[] args) {
        int[] num = {2,7,9,3,1};
        int money = rob(num);
        System.out.println(money);
    }
    private static int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;

        int high = 0, low = 0;
        for (int num : nums) {
            int prev = high;
            high = Math.max(low + num, high);
            low = prev;
        }
        return high;
    }
}
