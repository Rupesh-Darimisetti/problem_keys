package easy;

import java.util.Arrays;

public class _04_TwoSumII_InputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = new int[]{-1, 0};
        int target = -1;
        int[] res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int sum;
        int[] ans = {0, 0};
        int first = 0;
        int last = numbers.length - 1;
        while (true) {
            sum = numbers[first] + numbers[last];
            if (sum == target) {
                ans[0] = first + 1;
                ans[1] = last + 1;
                break;
            } else if (sum > target) {
                last--;
            } else first++;
        }
        return ans;
    }
}
