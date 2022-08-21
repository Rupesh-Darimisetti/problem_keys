package basic;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double first_no = input.nextDouble();
        System.out.print("Enter second number: ");
        double second_no = input.nextDouble();
        double sum = first_no + second_no;
        System.out.println("The sum of " + first_no + " + " + second_no + " = " + sum);
    }
}
