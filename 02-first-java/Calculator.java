// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // define necessary variables
        float firstNo, secondNo, result = 0f;

        System.out.print("Enter First number: ");
        firstNo = input.nextFloat();

        System.out.print("Enter Second number: ");
        secondNo = input.nextFloat();

        System.out.print("Enter a calculation operate from + - * /: ");
        char operator = input.next().charAt(0);

        // operation to be performed
        if (operator == '+') {
            result = firstNo + secondNo;
        } else if (operator == '-') {
            result = firstNo - secondNo;
        } else if (operator == '*') {
            result = firstNo * secondNo;
        } else if (operator == '/') {
            result = firstNo / secondNo;
        } else {
            System.out.print("Invalid Operator");
        }

        System.out.println(firstNo + " "+ operator +" "+ secondNo + " = " + result);
    }
}
