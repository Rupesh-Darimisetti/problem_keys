package easy;

import java.util.List;

public class _20_DetermineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,1}}, target = {{1,0},{0,1}};
//        int[][] mat = {{0,1},{1,0}}, target = {{1,0},{0,1}};
        System.out.println(findRotation(mat, target));

    }
    private static boolean findRotation(int[][] mat, int[][] target) {
        boolean[] c = new boolean[4];
        for(int i=0;i<4;i++) {
            c[i]=true;
        }
        int n=mat.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(mat[i][j] != target[i][j])
                    c[0] = false;
                if(mat[i][j] != target[n-j-1][i])
                    c[1] = false;
                if(mat[i][j] != target[n-i-1][n-j-1])
                    c[2] = false;
                if(mat[i][j] != target[j][n-i-1])
                    c[3] = false;
            }
        }
        return c[0]||c[1]||c[2]||c[3];
    }
}
