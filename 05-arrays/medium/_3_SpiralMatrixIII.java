package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_SpiralMatrixIII {
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] res = spiralMatrixIII(rows, cols, rStart, cStart);
        System.out.println(Arrays.deepToString(res));
    }
    private static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] dirt = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        List<int[]> res = new ArrayList<>();
        int len = 0, d = 0; // move <len> steps in the <d> direction
        res.add(new int[]{rStart, cStart});
        while (res.size() < rows * cols) {
            if (d == 0 || d == 2) len++; // when move east or west, the length of path need plus 1
            for (int i = 0; i < len; i++) {
                rStart += dirt[d][0];
                cStart += dirt[d][1];
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) // check valid
                    res.add(new int[]{rStart, cStart});
            }
            d = (d + 1) % 4; // turn to next direction
        }
        return res.toArray(new int[rows * cols][2]);
    }
}

