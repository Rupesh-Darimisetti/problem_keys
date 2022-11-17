package easy;

// 7. Number of Good Pairs
// https://leetcode.com/problems/number-of-good-pairs/
public class _07_NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 1, 1, 3};
        int noOfGreatPairs = numberOfGoodPairs(numberArray);
        System.out.println(noOfGreatPairs);
        int[] num = {1, 1, 1, 1};
        noOfGreatPairs = numberOfGoodPairs(num);
        System.out.println(noOfGreatPairs);
    }

    public static int numberOfGoodPairs(int[] numberArray) {
        int len = numberArray.length;
        int count = 0;
        for (int row = 0; row < len; row++) {
            for (int col = 0; col < len; col++) {
                if (row < col && numberArray[row] == numberArray[col]) count++;
            }
        }
        return count;
    }
}
