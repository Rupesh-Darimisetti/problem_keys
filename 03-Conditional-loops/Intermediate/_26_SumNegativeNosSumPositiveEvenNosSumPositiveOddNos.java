package intermediate;

import java.util.Scanner;

// 26. Write a program to print the sum of negative numbers, sum of positive even numbers
// and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
public class _26_SumNegativeNosSumPositiveEvenNosSumPositiveOddNos {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("""
                    Enter a set of Nos to print the sum of negative numbers, sum of positive even numbers
                    and the sum of positive odd numbers from a list of numbers (N) entered by the user.
                    The list terminates when the user enters a zero.""");
            int num = input.nextInt();
            long negativeSum = 0, positiveEvenSum = 0, positiveOddSum = 0;
            while (num != 0) {
                if (num < 0) {
                    negativeSum += num;
                } else {
                    if (num % 2 == 0)
                        positiveEvenSum += num;
                    if (num % 2 != 0)
                        positiveOddSum += num;
                }
                num = input.nextInt();
            }
            System.out.println("The sum of Negative Numbers = " + negativeSum);
            System.out.println("The sum of Positive Even Numbers = " + positiveEvenSum);
            System.out.println("The sum of Positive Odd Numbers = " + positiveOddSum);

        }
    }
}
