import java.util.Scanner;

// 5. Define a method that returns the product of two numbers entered by user.
public class _05_ProductOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Program to Find Product of Two Numbers");
            System.out.print("Enter First Number: ");
            double first_num = input.nextDouble();
            System.out.print("Enter Second Number: ");
            double second_num = input.nextDouble();
            double product_of_two_numbers = product(first_num, second_num);
            System.out.println("The product of " + first_num + " * " + second_num + " = " + product_of_two_numbers);
        }
    }

    private static double product(double first_num, double second_num) {
        return first_num * second_num;
    }
}
