package intermediate;

import java.util.Scanner;

// 11. Compound Interest Java Program
public class _11_CompoundInterest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter principal Amount: ");
            double principal = input.nextDouble();
            System.out.print("Enter Interest rate: ");
            double rateOfInterest = input.nextDouble() / 100;
            System.out.print("Enter total time elapsed or for a year how many times the Interest is paid: ");
            double timeElapsed = input.nextDouble();
            System.out.print("Enter time in years: ");
            float time = input.nextFloat();
            double compoundInterest = principal * Math.pow((1 + (rateOfInterest / timeElapsed)), (timeElapsed * time));
            System.out.print("The Compound Interest = " + compoundInterest);
        }
    }
}
