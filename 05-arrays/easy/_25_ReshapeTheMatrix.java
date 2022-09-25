package easy;

import java.util.Arrays;

public class _25_ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        System.out.println(Arrays.deepToString(ans));
    }
    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c)
            return mat;

        int nr = 0, nc = 0;
        int[][] res = new int[r][c];
        for (int[] ints : mat) {
            for (int j = 0; j < n; j++) {
                res[nr][nc] = ints[j];
                nc++;
                if (nc == c) {
                    nr += 1;
                    nc = 0;
                }
            }
        }
        return res;
    }
}
