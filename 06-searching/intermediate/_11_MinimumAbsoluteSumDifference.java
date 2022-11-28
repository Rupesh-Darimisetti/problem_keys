package intermediate;

public class _11_MinimumAbsoluteSumDifference {
    public static void main(String[] args) {
        int[] numberArray1 = {1, 10, 4, 4, 2, 7}, numberArray2 = {9, 3, 5, 1, 7, 4};
        int result = minAbsoluteSumDiff(numberArray1, numberArray2);
        System.out.println(result);
    }

    private static int minAbsoluteSumDiff(int[] numberArray1, int[] numberArray2) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numberArray1.length; i++) {
            min = Math.min(min, Math.min(numberArray1[i], numberArray2[i]));
            max = Math.max(max, Math.max(numberArray1[i], numberArray2[i]));
        }
        int[] less = new int[max - min + 1];
        int[] more = new int[max - min + 1];
        // set default value so it can be skipped for calculation
        less[0] = -max - 1;
        more[more.length - 1] = ((max + 1) << 1);
        for (int num : numberArray1) {
            less[num - min] = num;
            more[num - min] = num;
        }
        // because numberArray[i] > 1, if less or more is 0, which means it's not set yet, we can fill the nearest value
        // fill less from smaller to larger
        for (int i = 1; i < less.length; i++) {
            if (less[i] == 0) {
                less[i] = less[i - 1];
            }
        }
        // fill more from larger to smaller
        for (int i = more.length - 2; i >= 0; i--) {
            if (more[i] == 0) {
                more[i] = more[i + 1];
            }
        }
        int total = 0;
        int preSave = 0;
        for (int i = 0; i < numberArray1.length; i++) {
            int current = Math.abs(numberArray1[i] - numberArray2[i]);
            total += current;
            int save = current - Math.min(Math.abs(less[numberArray2[i] - min] - numberArray2[i]),
                                 Math.abs(more[numberArray2[i] - min] - numberArray2[i]));
            if (save > preSave) {
                total = total + preSave - save;
                preSave = save;
            }
            total = total % 1_000_000_007;
        }
        return total;
    }
}
