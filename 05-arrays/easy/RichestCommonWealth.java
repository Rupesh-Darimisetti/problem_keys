package easy;

// 4. Richest Customer Wealth
public class RichestCommonWealth {
    public static void main(String[] args) {
        int[][] account = {{1,5},{7,3},{3,5}};
        int max_wealth = maximumWealth(account);
        System.out.println(max_wealth);
    }
    public static int maximumWealth(int[][] accounts) {
        int row_len = accounts.length;
        int col_len = accounts[0].length;
        int[] rich = new int[row_len];
        for(int row = 0; row < row_len; row++){
            int sum = 0;
            for(int col = 0; col < col_len; col++) {
                sum += accounts[row][col];
                rich[row] = sum;
            }
        }
        int max = rich [0];
        for (int val = 0; val < row_len; val++) {
            if (max < rich[val]){
                max = rich[val];
            }
        }
        return max;
    }

}
