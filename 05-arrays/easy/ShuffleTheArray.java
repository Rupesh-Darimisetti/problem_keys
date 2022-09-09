package easy;

import java.util.Arrays;
// 5. Shuffle the Array
// Input: nums = [1,2,3,4,4,3,2,1], n = 4
// Output: [1,4,2,3,3,2,4,1]
public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] ans = shuffleThePuzzle(nums, n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] shuffleThePuzzle(int[] nums, int n){
        int len = nums.length;
        int[] arr = new int[len];
        for (int index = 0; index < len; index++) {
            if (index % 2 == 0) {
                arr[index] = nums[index / 2];
            } else {
                arr[index] = nums[(len + index - 1) / 2];
            }
        }
        return arr;
    }
}
