package assignment123Functions.firstJava;

import java.util.Scanner;

// 7. To calculate Fibonacci Series up to n numbers.
public class _07_Fibonacci {
    public static void main(String[] args) {
        final int num;
        int sum = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }
        System.out.print("Fibonacci Series: ");
        fibonacciSeries(num, sum);
    }

    private static void fibonacciSeries(int num, int sum) {
        while (fibonacci(sum) <= num) {
            System.out.print(fibonacci(sum) + " ");
            sum++;
        }
    }

    private static int fibonacci(int num) {
        return (num <= 1) ? num : fibonacci(num - 1) + fibonacci(num - 2);
    }
}
