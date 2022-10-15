package hard;

public class _02_FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,11,12};
        int pos = firstMissingPositive(nums);
        System.out.println(pos);
    }
   private static int firstMissingPositive(int[] nums) {
       int len = nums.length;
       for (int i = 0; i < len; i++) {
           if (nums[i] <= 0 || nums[i] > len) nums[i] = len + 1;
       }
       for (int i = 0; i < len; i++) {
           int val = Math.abs(nums[i]);
           if (val > len) continue;

           if (nums[val - 1] > 0)
               nums[val - 1] = -nums[val - 1];
       }
       for (int i = 0; i < len; i++) {
           if (nums[i] > 0)
               return i + 1;
       }
       return len + 1;

   }
}
