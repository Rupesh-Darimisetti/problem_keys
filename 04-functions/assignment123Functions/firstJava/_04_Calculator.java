package assignment123Functions.firstJava;

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class _04_Calculator {
    /**
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // define necessary variables
        double firstNo, secondNo, result;

        System.out.print("Enter First number: ");
        firstNo = input.nextDouble();

        System.out.print("Enter Second number: ");
        secondNo = input.nextDouble();

        System.out.print("Enter a calculation operate from + - * /: ");
        char operator = input.next().charAt(0);
        result = calc(firstNo, secondNo, operator);
        if (result != 0) {
            System.out.println(firstNo + " " + operator + " " + secondNo + " = " + result);
        } else {
            System.out.println("Invalid Operator");
        }

    }

    private static double calc(double firstNo, double secondNo, char operator) {
        double result = 0;
        // operation to be performed
        if (operator == '+') {
            result = firstNo + secondNo;
        } else if (operator == '-') {
            result = firstNo - secondNo;
        } else if (operator == '*') {
            result = firstNo * secondNo;
        } else if (operator == '/') {
            result = firstNo / secondNo;
        }
        return result;
    }
}
