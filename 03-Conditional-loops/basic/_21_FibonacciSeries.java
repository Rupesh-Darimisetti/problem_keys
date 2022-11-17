package basic;

import java.util.Scanner;

// 21. Fibonacci Series In Java Programs
public class _21_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number up to which you want Fibonacci Series: ");
        int number = input.nextInt();
        long first = 0L, second = 1L, temp;
        System.out.print("Fibonacci Series: " + first + " " + second);
        for (int index = 2; index < number; index++) {
            temp = first + second;
            System.out.print(" " + temp);
            first = second;
            second = temp;
        }
    }
}
