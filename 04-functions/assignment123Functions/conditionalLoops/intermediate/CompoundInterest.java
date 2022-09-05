package Intermediate;

import java.util.Scanner;

// 11. Compound Interest Java Program
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal Amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter Intrest rate: ");
        double rate_of_intrest = input.nextDouble() /100;
        System.out.print("Enter total time elasped or for a year how many times the intrest is paid: ");
        double time_elasped = input.nextDouble();
        System.out.print("Enter time in years: ");
        float time = input.nextFloat();
        double compund_intrest = principal * Math.pow((1 + (rate_of_intrest / time_elasped)),(time_elasped * time));
        System.out.print("The Compound intrest = " + compund_intrest);
    }
}
