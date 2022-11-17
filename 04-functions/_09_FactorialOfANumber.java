import java.math.BigInteger;
import java.util.Scanner;

// 9. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//4! = 1 * 2 * 3 * 4 = 24
//3! = 3 * 2 * 1 = 6
//2! = 2 * 1 = 2
//Also,
//1! = 1
//0! = 1
public class _09_FactorialOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = input.nextInt();
        BigInteger factorial = factorial(num);
        System.out.println("The Factorial of " + num + " = " + factorial);
    }

    private static BigInteger factorial(int num) {
        BigInteger res = BigInteger.valueOf(1);
        if (num <= 1) {
            return BigInteger.valueOf(1);
        }
        for (int val = 2; val <= num; val++) {
            res = res.multiply(BigInteger.valueOf(val));
        }
        return res;
    }

}
