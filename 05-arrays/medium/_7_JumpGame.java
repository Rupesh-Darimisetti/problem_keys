package medium;

public class _7_JumpGame {
    public static void main(String[] args) {
        int[] numberArray = {3, 2, 1, 0, 4};
        boolean canJump = canJump(numberArray);
        System.out.println(canJump);
    }

    private static boolean canJump(int[] numberArray) {
        int len = numberArray.length;
        int curr = 0;
        for (int i = 0; i < len; i++) {
            if (i > curr)
                return false;
            curr = Math.max(curr, i + numberArray[i]);
        }
        return true;
    }
}
