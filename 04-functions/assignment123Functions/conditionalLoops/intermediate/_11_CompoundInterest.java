package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 11. Compound Interest Java Program
public class _11_CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter Interest rate: ");
        double rate_of_interest = input.nextDouble() / 100;
        System.out.print("Enter total time elapsed or for a year how many times the interest is paid: ");
        double time_elapsed = input.nextDouble();
        System.out.print("Enter time in years: ");
        float time = input.nextFloat();
        double compound_interest = compoundInterest(principal, rate_of_interest, time_elapsed, time);
        System.out.print("The Compound Interest = " + compound_interest);
    }

    private static double compoundInterest(double principal, double rate_of_interest, double time_elapsed, float time) {
        return principal * Math.pow((1 + (rate_of_interest / time_elapsed)), (time_elapsed * time));
    }
}
