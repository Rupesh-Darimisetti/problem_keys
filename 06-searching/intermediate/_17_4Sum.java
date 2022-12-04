package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _17_4Sum {
    public static void main(String[] args) {
        int[] numberArray = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> arraySum = fourSum(numberArray, target);
        System.out.println(arraySum);
    }

    private static List<List<Integer>> fourSum(int[] numberArray, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = numberArray.length;
        Arrays.sort(numberArray);

        for (int rows = 0; rows < len; rows++) {
            for (int column = rows + 1; column < len; column++) {

                long target2 = (long) target - (long) numberArray[rows] - (long) numberArray[column];
                int low = column + 1, high = len - 1;

                while (low < high) {
                    int twoSum = numberArray[low] + numberArray[high];

                    if (twoSum < target2) {
                        low++;
                    } else if (twoSum > target2) {
                        high--;
                    } else {
                        List<Integer> quad = Arrays.asList(numberArray[rows], numberArray[column], numberArray[low], numberArray[high]);
                        ans.add(quad);
                        while (low < high && numberArray[low] == quad.get(2)) {
                            low++;
                        }
                        while (low < high && numberArray[high] == quad.get(3)) {
                            high--;
                        }
                    }
                }
                while (column + 1 < len && numberArray[column] == numberArray[column + 1]) {
                    column++;
                }
            }
            while (rows + 1 < len && numberArray[rows] == numberArray[rows + 1]) {
                rows++;
            }
        }

        return ans;
    }
}
