package easy;

/**
 * Given an m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
 * return the number of negative numbers in grid.
 */

public class _11_CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}; // Output: 8

        int countNegatives = countNegatives(grid);

        System.out.println(countNegatives);
    }
    // Logic 2ms execution
    private static int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] rows : grid) {
            for (int col_element : rows) {
                if (col_element < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
