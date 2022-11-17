package easy;

public class _28_MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        int[] position = {2, 2, 2, 3, 3};
        int cost = minCostToMoveChips(position);
        System.out.println(cost);
    }

    private static int minCostToMoveChips(int[] position) {
        int count1 = 0, count2 = 0;
        for (int j : position) {
            if (j % 2 != 0) count1++;
            else count2++;
        }
        return Math.min(count1, count2);
    }
}
