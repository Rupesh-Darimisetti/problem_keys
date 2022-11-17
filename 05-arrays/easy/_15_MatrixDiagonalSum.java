package easy;

public class _15_MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = diagonalSum(mat);
        System.out.println(sum);
    }

    public static int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for (int index = 0; index < len; index++) {
            sum += mat[index][index];
            sum += mat[len - index - 1][index];
        }
        if (len % 2 == 1) {
            sum -= mat[len / 2][len / 2];
        }
        return sum;
    }
}
