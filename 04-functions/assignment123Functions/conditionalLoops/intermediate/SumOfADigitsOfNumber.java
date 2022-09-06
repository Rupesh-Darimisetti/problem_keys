package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 24. Sum Of A Digits Of Number
public class SumOfADigitsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find Sum Of A Digits Of Number: ");
        long num = input.nextLong();
        long sum = 0;
        sum = sumOfDigits(num, sum);
        System.out.println("The sum of individual digits of " + num + " is " + sum);
    }
    private static long sumOfDigits(long num, long sum) {
        long rem;
        while(num != 0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
