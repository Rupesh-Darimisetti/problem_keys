package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 22. Perfect Number In Java
public class _22_PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to check weather it is Perfect Number or not: ");
        long num = input.nextLong();
        int sum = checkPerfectNumber(num);
        String message = (sum == num && num != 1) ? " is a perfect number" : " is not a perfect number";
        System.out.println("The Given Number " + num + message);
    }

    // A number is a perfect number if is equal to sum of its proper divisors,
    // that is, sum of its positive divisors excluding the number itself
    private static int checkPerfectNumber(long num) {
        int sum = 1;
        for (int val = 2; (long) val * val <= num; val++)
            if (num % val == 0) {
                int sq_num = val * val;
                sum = (sq_num != num) ? sum + val + (int) (num / val) : sum + val;
            }
        return sum;
    }
}
