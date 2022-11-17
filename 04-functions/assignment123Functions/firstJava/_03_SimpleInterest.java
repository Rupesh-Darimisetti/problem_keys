package assignment123Functions.firstJava;

// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class _03_SimpleInterest {
    public static void main(String[] args) {
        float principal, timePeriod, rateOfInterest, simpleInterest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        principal = input.nextFloat();
        System.out.print("Enter time period in years: ");
        timePeriod = input.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        rateOfInterest = input.nextFloat();
        simpleInterest = simpleInterest(principal, timePeriod, rateOfInterest);
        System.out.println("Simple Interest: " + simpleInterest);
    }

    private static float simpleInterest(float principal, float timePeriod, float rateOfInterest) {
        return principal * timePeriod * rateOfInterest / 100;
    }
}
