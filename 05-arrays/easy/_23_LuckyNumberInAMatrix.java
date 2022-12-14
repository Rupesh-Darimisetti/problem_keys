package easy;

import java.util.ArrayList;
import java.util.List;

public class _23_LuckyNumberInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }

    private static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowLen = matrix.length, columnLen = matrix[0].length;

        int[] min = new int[rowLen];
        int[] max = new int[columnLen];

        for (int row = 0; row < rowLen; row++) {
            int mini = Integer.MAX_VALUE;
            for (int col = 0; col < columnLen; col++)
                if (matrix[row][col] < mini)
                    mini = matrix[row][col];
            min[row] = mini;
        }

        for (int col = 0; col < columnLen; col++) {
            int maxi = Integer.MIN_VALUE;
            for (int[] ints : matrix)
                if (ints[col] > maxi) maxi = ints[col];
            max[col] = maxi;
        }

        for (int row : min) {
            for (int col : max)
                if (row == col) ans.add(row);
        }

        return ans;
    }
}
