package easy;

public class _14_CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        int arr = oddCells(m,n,indices);
        System.out.println(arr);
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] rowArr =new int[m];
        int[] colArr =new int[n];
        int count=0;
        for (int[] index : indices) {
            rowArr[index[0]]++;
            colArr[index[1]]++;
        }
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                count += (rowArr[row] + colArr[col]) % 2;
            }
        }
        return count;
    }
}