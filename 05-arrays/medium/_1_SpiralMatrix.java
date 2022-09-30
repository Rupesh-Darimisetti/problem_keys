package medium;

import java.util.ArrayList;
import java.util.List;

public class _1_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        // total loop count is equal to matrix width * matrix height
        int count = matrix.length * matrix[0].length;

        //  (i, j): record current index
        int i = 0;
        int j = 0;

        // dirIndex: record current direction
        int dirIndex = 0;

        // direction list
        int[][] dir = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};

        while(count > 0){
            // add current int to our answer
            ans.add(matrix[i][j]);

            // set current int to -101 as boundary & to avoid duplicates
            matrix[i][j] = -101;

            // next (i, j) = current (i, j) + current direction
            int nextI = i + dir[dirIndex][0];
            int nextJ = j + dir[dirIndex][1];

            // if next(i, j) is out of bound or already visited, change direction and recalculate next(i, j)
            // else set current(i, j) = next (i, j)
            if(nextI < 0 || nextJ < 0 || nextI >= matrix.length || nextJ >= matrix[0].length || matrix[nextI][nextJ] == -101){
                dirIndex++;
                dirIndex %= 4;
                i += dir[dirIndex][0];
                j += dir[dirIndex][1];
            }else{
                i = nextI;
                j = nextJ;
            }

            count--;
        }
        return ans;
    }
}
