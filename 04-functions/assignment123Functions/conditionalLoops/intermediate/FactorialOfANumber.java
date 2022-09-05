package Intermediate;

import java.math.BigInteger;
import java.util.Scanner;

// 1. Factorial Program In Java
public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to find Factorial: ");
        int num = input.nextInt();
        BigInteger factorial = BigInteger.ONE;
        int val =1;
        while (val <= num){
            factorial = factorial.multiply(BigInteger.valueOf(val));
            val++;
        }
        System.out.println("The Factorial of " + num + " = " + factorial);
    }
}
