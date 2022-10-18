package hard;

public class _03_GoodArray {
    public static void main(String[] args) {
        int[] nums = {12,5,7,23};
        boolean state = isGoodArray(nums);
        System.out.println(state);
    }
    private static boolean isGoodArray(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = GCD(nums[i], result);
        }
        return result == 1;
    }
    private  static int GCD(int i,int j){
        if(j==0) return i;
        return GCD(j,i%j);
    }
}
