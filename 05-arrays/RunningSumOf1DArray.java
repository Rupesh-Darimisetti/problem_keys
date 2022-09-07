import  java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int[] runningSum = runningSum(num);
        System.out.println(Arrays.toString(runningSum));
    }
    private static int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] number = new int[len];
        int sum = 0;
        for(int val = 0; val <len; val++){
            sum = sum + nums[val];
            number[val] = sum;
        }
        return number;
    }
}

