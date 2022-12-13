package assignment123Functions.flowOfProgram;

import java.util.Scanner;

// 2. Take two numbers and print the sum of both.
public class _02_SumOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int first_num = input.nextInt();
            System.out.print("Enter Second Number: ");
            int second_num = input.nextInt();
            int sum_of_two_nos = sum(first_num, second_num);
            System.out.println("The sum of " + first_num + " + " + second_num + " = " + sum_of_two_nos);
        }
    }

    private static int sum(int first_num, int second_num) {
        return first_num + second_num;
    }
}
