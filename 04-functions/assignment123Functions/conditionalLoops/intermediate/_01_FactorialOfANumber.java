package assignment123Functions.conditionalLoops.intermediate;

import java.math.BigInteger;
import java.util.Scanner;

// 1. Factorial Program In Java
public class _01_FactorialOfANumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a Number to find Factorial: ");
            int number = input.nextInt();
            BigInteger factorial = factorialOfANumber(number);
            System.out.println("The Factorial of " + number + " = " + factorial);
        }
    }

    private static BigInteger factorialOfANumber(int number) {
        BigInteger factorial = BigInteger.ONE;
        int val = 1;
        while (val <= number) {
            factorial = factorial.multiply(BigInteger.valueOf(val));
            val++;
        }
        return factorial;
    }
}
