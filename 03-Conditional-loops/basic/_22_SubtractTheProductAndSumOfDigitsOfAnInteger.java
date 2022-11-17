package basic;

import java.util.Scanner;

// 22. Subtract the Product and Sum of Digits of an Integer
public class _22_SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the diff of prod and sum of number without zero: ");
        int num = input.nextInt();
        int sum = 0, prod = 1;
        while (num != 0) {
            int rem = num % 10;
            prod *= rem;
            sum += rem;
            num /= 10;
        }
        int sol = prod - sum;
        System.out.println("Difference in product and sum of digits = " + sol);
    }
}
