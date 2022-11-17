package hard;

public class _03_GoodArray {
    public static void main(String[] args) {
        int[] numbersArray = {12, 5, 7, 23};
        boolean state = isGoodArray(numbersArray);
        System.out.println(state);
    }

    private static boolean isGoodArray(int[] numbersArray) {
        int result = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            result = GCD(numbersArray[i], result);
        }
        return result == 1;
    }

    private static int GCD(int i, int j) {
        if (j == 0) return i;
        return GCD(j, i % j);
    }
}
