package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 21. Fibonacci Series In Java Programs
public class _21_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number up to which you want Fibonacci Series: ");
        int number = input.nextInt();
        long first = 0L;
        long second = 1L;
        System.out.print("Fibonacci Series: " + first + " " + second);
        fibonacci(number, first, second);
    }

    private static void fibonacci(int number, long first, long second) {
        long temp;
        for (int index = 2; index < number; index++) {
            temp = first + second;
            System.out.print(" " + temp);
            first = second;
            second = temp;
        }
    }
}
