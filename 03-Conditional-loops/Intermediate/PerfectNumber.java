package Intermediate;

import java.util.Scanner;
// 22. Perfect Number In Java
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to check weather it is Perfect Number or not: ");
        long num = input.nextLong();
        int sum =1;
        for (int val = 2; (long) val * val <= num; val++)
            if (num % val == 0) {
                int sq_num = val * val;
                sum = (sq_num != num) ? sum + val + (int) (num / val) : sum + val;
            }
        String message = (sum == num && num != 1) ? " is a perfect number": " is not a perfect number";
        System.out.println("The Given Number " + num + message);
    }
}
