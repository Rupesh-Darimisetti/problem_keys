package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

public class _26_AdditionOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double first_no = input.nextDouble();
            System.out.print("Enter second number: ");
            double second_no = input.nextDouble();
            double sum = sum(first_no, second_no);
            System.out.println("The sum of " + first_no + " + " + second_no + " = " + sum);
        }
    }

    private static double sum(double first_no, double second_no) {
        return first_no + second_no;
    }
}
