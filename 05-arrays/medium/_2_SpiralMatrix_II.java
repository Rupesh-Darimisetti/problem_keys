package medium;

import java.util.Arrays;

public class _2_SpiralMatrix_II {
    public static void main(String[] args) {
        int n = 3;
        int[][] res = generateMatrix(n);
        System.out.println(Arrays.deepToString(res));
    }

    private static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int row = 0, col = 0, k = 1;
        int r = n, c = n;
        while (row < r && col < c) {
            for (int i = col; i < c; i++)
                ans[row][i] = k++;
            row++;
            for (int i = row; i < r; i++)
                ans[i][c - 1] = k++;
            c--;
            if (row < r) {
                for (int i = c - 1; i >= col; i--)
                    ans[r - 1][i] = k++;
                r--;
            }
            if (col < c) {
                for (int i = r - 1; i >= row; i--)
                    ans[i][col] = k++;
                col++;
            }
        }
        return ans;
    }
}
