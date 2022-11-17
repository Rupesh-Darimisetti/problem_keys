package intermediate;

import java.util.Scanner;

// 24. Sum Of A Digits Of Number
public class _24_SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find Sum Of A Digits Of Number: ");
        long num = input.nextLong();
        long sum = 0, rem, real_num = num;
        while (num != 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("The sum of individual digits of " + real_num + " is " + sum);
    }
}
