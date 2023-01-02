package org.rupesh.easy;

import java.util.Arrays;
import java.util.HashMap;

public class _19_RankTransformOfAnArray {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        int[] res = arrayRankTransform(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] copySort = arr.clone();
        Arrays.sort(copySort);

        int index = 1;
        for (int num : copySort) { // runs for each loop for sorted array
            if (map.putIfAbsent(num, index) == null) { // set the index value all the new increasing numbers
                index++;
            }
        }
        // sets the ranking value to the respective numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
