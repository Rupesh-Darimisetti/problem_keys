package easy;

import java.util.ArrayList;

/**
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k. Return the kth
 * positive integer that is missing from this array.
 */
public class _08_KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int value = findKthPositive(arr, k);
        System.out.println(value);
    }

    private static int findKthPositive(int[] arr, int k) {
        int num = 1, index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (index < arr.length) {
            if (arr[index] != num) {
                list.add(num);
                num++;
            } else {
                num++;
                index++;
            }
            if (list.size() == k) break;
        }
        while (list.size() != k) {
            list.add(num++);
        }
        return list.get(k - 1);
    }
}
