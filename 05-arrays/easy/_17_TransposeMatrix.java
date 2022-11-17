package easy;

import java.util.Arrays;

public class _17_TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr = transpose(matrix);
        System.out.println(Arrays.deepToString(arr));
    }

    private static int[][] transpose(int[][] matrix) {
        int row_len = matrix.length, col_len = matrix[0].length;
        int[][] newArr = new int[col_len][row_len];
        row_len = newArr.length;
        for (int row = 0; row < row_len; row++) {
            for (int col = 0; col < newArr[row].length; col++) {
                newArr[row][col] = matrix[col][row];
            }
        }
        return newArr;
    }
}
