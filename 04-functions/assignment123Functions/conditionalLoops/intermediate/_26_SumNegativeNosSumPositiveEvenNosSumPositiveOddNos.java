package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 26. Write a program to print the sum of negative numbers, sum of positive even numbers
// and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class _26_SumNegativeNosSumPositiveEvenNosSumPositiveOddNos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Enter a set of Nos to print the sum of negative numbers, sum of positive even numbers
                and the sum of positive odd numbers from a list of numbers (N) entered by the user.
                The list terminates when the user enters a zero.""");
        int num = input.nextInt();
        sumOfPositiveEvenOddAndNegativeNos(input, num);
    }

    private static void sumOfPositiveEvenOddAndNegativeNos(Scanner input, int num) {
        long neg_sum = 0, pos_eve_sum = 0, pos_odd_sum = 0;
        while (num != 0) {
            if (num < 0) {
                neg_sum += num;
            } else {
                if (num % 2 == 0) pos_eve_sum += num;
                if (num % 2 != 0) pos_odd_sum += num;
            }
            num = input.nextInt();
        }
        System.out.println("The sum of Negative Numbers = " + neg_sum);
        System.out.println("The sum of Positive Even Numbers = " + pos_eve_sum);
        System.out.println("The sum of Positive Odd Numbers = " + pos_odd_sum);
    }
}
