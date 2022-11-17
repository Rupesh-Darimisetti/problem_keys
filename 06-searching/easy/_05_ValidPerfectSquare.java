package easy;

public class _05_ValidPerfectSquare {
    public static void main(String[] args) {
        int number = 16;
        boolean validPerfectSquare = isPerfectSquare(number);
        System.out.println(validPerfectSquare);
    }

    private static boolean isPerfectSquare(int num) {
        long low = 1;
        long high = num;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
