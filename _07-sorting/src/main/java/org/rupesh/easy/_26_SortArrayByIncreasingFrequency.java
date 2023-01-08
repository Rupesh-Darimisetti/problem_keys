package org.rupesh.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/sort-array-by-increasing-frequency/
public class _26_SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] numberArray = {1, 1, 2, 2, 2, 3};
        int[] res = frequencySort(numberArray);
        System.out.println(Arrays.toString(res));
    }

    public static int[] frequencySort(int[] numberArray) {
        int[] count = new int[201];
        List<Integer> resArray = new ArrayList<>();
        for (int num : numberArray) {
            num += 100;
            ++count[num];
            resArray.add(num);
        }
        resArray.sort((currentVal, nextVal) -> count[currentVal] == count[nextVal] ?
                nextVal - currentVal : count[currentVal] - count[nextVal]);
        int[] ans = new int[numberArray.length];
        int i = 0;
        for (int num : resArray) {
            ans[i++] = num - 100;
        }
        return ans;
    }
}
