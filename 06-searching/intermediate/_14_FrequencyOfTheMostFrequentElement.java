package intermediate;

import java.util.Arrays;

public class _14_FrequencyOfTheMostFrequentElement {

    public static void main(String[] args) {
        int[] numberArray = {1, 4, 8, 13};
        int target = 5; // output : 2
        int result = maxFrequency(numberArray, target);
        System.out.println(result);

    }

    private static int maxFrequency(int[] numberArray, int target) {
        Arrays.sort(numberArray);
        int right, left = 0, max_val = 0;
        long sum = 0;
        int len = numberArray.length;
        right = 0;
        while (right < len) {
            sum += numberArray[right];
            while ((long) numberArray[right] * (right - left + 1) > target + sum) {
                sum -= numberArray[left];
                left++;
            }
            max_val = Math.max(max_val, right - left + 1);
            right++;
        }
        return max_val;
    }
}
