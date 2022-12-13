package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 22. Subtract the Product and Sum of Digits of an Integer
public class _22_SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to find the diff of prod and sum of number without zero: ");
            int num = input.nextInt();
            int sol = prodMinusSumOfNumber(num);
            System.out.println("Difference in product and sum of digits = " + sol);
        }
    }

    private static int prodMinusSumOfNumber(int num) {
        int sum = 0, prod = 1;
        while (num != 0) {
            int rem = num % 10;
            prod *= rem;
            sum += rem;
            num /= 10;
        }
        return prod - sum;
    }
}
