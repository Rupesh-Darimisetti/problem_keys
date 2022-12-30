package org.rupesh.easy;

import java.util.Arrays;

public class _16_HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        int differentHeights = heightChecker(heights);
        System.out.println(differentHeights);
    }

    public static int heightChecker(int[] heights) {
        // copy of original array
        int[] origin = heights.clone();
        Arrays.sort(origin);
        int len = heights.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (origin[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
