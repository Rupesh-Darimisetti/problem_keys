package intermediate;

import java.util.Arrays;

/**
 * A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left,
 * right, top, and bottom. Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak
 * element mat[i][j] and return the length 2 array [i,j]. You may assume that the entire matrix is surrounded by an
 * outer perimeter with the value -1 in each cell. You must write an algorithm that runs in O(m log(n)) or O(n log(m))
 * time.
 */
public class _13_FindAPeakElementII {
    public static void main(String[] args) {
        int[][] numberArray = {{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};
        int[] result = findPeakGrid(numberArray);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findPeakGrid(int[][] matrix) {
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startCol <= endCol) {
            int maxRow = 0;
            int midCol = startCol + (endCol - startCol) / 2;

            for (int row = 0; row < matrix.length; row++) {
                maxRow = (matrix[row][midCol] >= matrix[maxRow][midCol]) ? row : maxRow;
            }

            boolean leftIsBig = ((midCol - 1) >= startCol) && (matrix[maxRow][midCol - 1] > matrix[maxRow][midCol]);
            boolean rightIsBig = ((midCol + 1) <= endCol) && (matrix[maxRow][midCol + 1] > matrix[maxRow][midCol]);

            if (!leftIsBig && !rightIsBig) {  // we have found the peak element
                return new int[]{maxRow, midCol};
            } else if (rightIsBig) {  // if rightIsBig, then there is an element in 'right' that is bigger than all the elements in the 'midCol',
                startCol = midCol + 1; //so 'midCol' cannot have a 'peakPlane'
            } else { // leftIsBig
                endCol = midCol - 1;
            }
        }
        return null;
    }
}
