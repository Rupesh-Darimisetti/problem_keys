import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
    int[] nums = {1,2,1};
    int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length, new_len = 2* len;
        int[] number = new int[new_len];
        for(int val = 0; val < len; val++){
                number[val] = nums[val];
                number[val+len] = nums[val];
        }
        return number;
    }
}
