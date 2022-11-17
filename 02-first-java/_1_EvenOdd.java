// 1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class _1_EvenOdd {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            // message to take input value
            System.out.print("Enter a number to check whether a number is even or odd: ");
            // input value from the user
            int number = input.nextInt();
            String message;

            if (number % 2 == 0) {
                message = "Even number";
            } else {
                message = "Odd number";
            }

            System.out.println(message);
        }
    }
}
