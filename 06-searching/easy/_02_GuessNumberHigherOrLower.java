package easy;

public class _02_GuessNumberHigherOrLower {

    static final int pick = 6;

    public static void main(String[] args) {
        int num = 10;
        int guessNo = guessNumber(num);
        System.out.println(guessNo);
    }

    private static int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int g = guess(mid);
            if (g == 1) low = mid + 1;
            else if (g == -1) high = mid - 1;
            else return mid;
        }
        return 1;
    }

    private static int guess(int mid) {
        return Integer.compare(pick, mid);
    }
}
