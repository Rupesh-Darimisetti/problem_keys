import java.util.Scanner;

// 4. Write a program to print the sum of two numbers entered by user by defining your own method.
public class _04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program to find sum of two number");
        System.out.print("Enter first Number: ");
        double first_num = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double second_num = input.nextDouble();
        double sum_of_two_number = sum(first_num, second_num);
        System.out.println("The Sum of " + first_num + " +  " + second_num + " = " + sum_of_two_number);
    }

    private static double sum(double first_no, double second_no) {
        return first_no + second_no;
    }
}
