package assignment123Functions.firstJava;// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        float principal, timePeriod, rateOfIntrest, simpleIntrest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        principal = input.nextFloat();
        System.out.print("Enter time period in years: ");
        timePeriod = input.nextFloat();
        System.out.print("Enter Rate of Intrest: ");
        rateOfIntrest = input.nextFloat();
        simpleIntrest = simpleIntrest(principal, timePeriod, rateOfIntrest);
        System.out.println("Simple Intrest: " + simpleIntrest);
    }

    private static float simpleIntrest(float principal, float timePeriod, float rateOfIntrest) {
        return principal * timePeriod * rateOfIntrest / 100;
    }
}
