package easy;

public class _16_FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int count = findNumbers(nums);
        System.out.println(count);
    }
    private static int findNumbers(int[] nums) {
        int count = 0,  num_length;
        String num_string;
        for (int num: nums) {
            num_string = Integer.toString(num);
            num_length = num_string.length();
            if (num_length % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
