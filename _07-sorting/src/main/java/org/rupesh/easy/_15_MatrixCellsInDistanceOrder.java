package org.rupesh.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/matrix-cells-in-distance-order/
public class _15_MatrixCellsInDistanceOrder {
    public static void main(String[] args) {
        int rows = 2, cols = 3, rCenter = 1, cCenter = 2;
        int[][] result = allCellsDistOrder(rows, cols, rCenter, cCenter);
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> coordinate = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int[] arr = new int[2];
                arr[0] = row;
                arr[1] = col;
                coordinate.add(arr);
            }
        }
        coordinate.sort((arr1, arr2) -> Math.abs(rCenter - arr1[0]) + Math.abs(cCenter - arr1[1]) - Math.abs(rCenter - arr2[0]) - Math.abs(cCenter - arr2[1]));
        int[][] array = new int[coordinate.size()][2];
        for (int i = 0; i < coordinate.size(); i++) {
            array[i] = coordinate.get(i);
        }
        return array;
    }
}
