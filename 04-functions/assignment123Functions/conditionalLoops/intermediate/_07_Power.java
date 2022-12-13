package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 7. Power In Java
public class _07_Power {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Number: ");
            double num = input.nextDouble();
            System.out.print("Enter power/ times the value: ");
            double pow = input.nextDouble();
            double value = 1;
            value = power(num, pow, value);
            System.out.println("The power of " + num + " to the " + pow + " = " + value);
        }
    }

    private static double power(double num, double pow, double value) {
        while (pow != 0) {
            value *= num;
            pow--;
        }
        return value;
    }
}
