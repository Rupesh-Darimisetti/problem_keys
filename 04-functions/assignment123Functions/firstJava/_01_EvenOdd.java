package assignment123Functions.firstJava;

import java.util.Scanner;

// 1. Write a program to print whether a number is even or odd, also take input from the user.
public class _01_EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // message to take input value
        System.out.print("Enter a number to check whether a number is even or odd: ");
        // input value from the user
        int number = input.nextInt();
        String message = evenOdd(number);
        System.out.println(message);
    }

    private static String evenOdd(int number) {
        return (number % 2 == 0) ? "Even number" : "Odd number";
    }
}
