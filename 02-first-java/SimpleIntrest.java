// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

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

        simpleIntrest = principal * timePeriod * rateOfIntrest / 100;

        System.out.println("Simple Intrest: " + simpleIntrest);
    }
}
