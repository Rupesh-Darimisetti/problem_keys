package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-of-smaller-numbers-after-self
public class _07_CountSmallerNumberAfterSelf {
    public static void main(String[] args) {
        int[] numberArray = {5, 2, 6, 1};
        List<Integer> count = countSmaller(numberArray);
        System.out.println(count);
    }

    private static List<Integer> countSmaller(int[] numberArray) {
        if (numberArray == null || numberArray.length == 0) return new ArrayList<>();
        int[] tmp = numberArray.clone();
        Arrays.sort(tmp);
        int[] bit = new int[numberArray.length + 1];
        for (int i : numberArray) addVal(bit, Arrays.binarySearch(tmp, i), 1);
        List<Integer> res = new ArrayList<>();
        for (int num : numberArray) {
            int idx = Arrays.binarySearch(tmp, num);
            addVal(bit, idx, -1);
            res.add(query(bit, idx - 1));
        }
        return res;
    }

    // add val to the ith element, O(logN)
    private static void addVal(int[] bit, int index, int val) {
        for (index += 1; index < bit.length; index += index & -index) {
            bit[index] += val;
        }
    }

    // query the range sum of [0, i], O(logN)
    private static int query(int[] bit, int index) {
        int res = 0;
        for (index += 1; index > 0; index -= index & -index) {
            res += bit[index];
        }
        return res;
    }
}