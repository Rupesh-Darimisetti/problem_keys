// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class _3_SimpleInterest {
    public static void main(String[] args) {
        float principal, timePeriod, rateOfInterest, simpleInterest;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter principal: ");
            principal = input.nextFloat();
            System.out.print("Enter time period in years: ");
            timePeriod = input.nextFloat();
            System.out.print("Enter Rate of Interest: ");
            rateOfInterest = input.nextFloat();
        }
        simpleInterest = principal * timePeriod * rateOfInterest / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
