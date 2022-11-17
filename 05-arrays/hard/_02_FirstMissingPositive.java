package hard;

public class _02_FirstMissingPositive {
    public static void main(String[] args) {
        int[] numbersArray = {7, 8, 9, 11, 12};
        int pos = firstMissingPositive(numbersArray);
        System.out.println(pos);
    }

    private static int firstMissingPositive(int[] numbersArray) {
        int len = numbersArray.length;
        for (int i = 0; i < len; i++) {
            if (numbersArray[i] <= 0 || numbersArray[i] > len) numbersArray[i] = len + 1;
        }
        for (int i = 0; i < len; i++) {
            int val = Math.abs(numbersArray[i]);
            if (val > len) continue;

            if (numbersArray[val - 1] > 0)
                numbersArray[val - 1] = -numbersArray[val - 1];
        }
        for (int i = 0; i < len; i++) {
            if (numbersArray[i] > 0)
                return i + 1;
        }
        return len + 1;

    }
}
