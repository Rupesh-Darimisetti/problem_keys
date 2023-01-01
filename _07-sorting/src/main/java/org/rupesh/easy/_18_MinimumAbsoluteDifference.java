package org.rupesh.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {3, 8, -10, 23, 19, -4, -14, 27};
        List<List<Integer>> list = minimumAbsDifference(arr);
        System.out.println(list);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();

        // find the minimum difference value
        for (int pos = 1; pos < arr.length; pos++) {
            if ((arr[pos] - arr[pos - 1]) < min) {
                min = arr[pos] - arr[pos - 1];
            }
        }
        // find the values with tha difference same as minimum value
        for (int pos = 1; pos < arr.length; pos++) {
            if ((arr[pos] - arr[pos - 1]) == min) {
                ans.add(Arrays.asList(arr[pos - 1], arr[pos]));
            }
        }
        return ans;
    }
}
