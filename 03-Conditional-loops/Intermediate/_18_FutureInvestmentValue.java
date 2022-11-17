package intermediate;

import java.util.Scanner;

// 18. Future Investment Value
public class _18_FutureInvestmentValue {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Following Details to fid  future value of product");
            System.out.print("Enter present Value of product: ");
            double presentValue = input.nextDouble();
            System.out.print("Enter Rate Of Interest: ");
            float rateOfInterest = input.nextFloat() / 100;
            System.out.print("Enter Number of Years the investment held: ");
            float timeInYears = input.nextFloat();
            double futureValue = presentValue * Math.pow((1 + rateOfInterest), timeInYears);
            System.out.println("The future value = " + futureValue);
        }

    }
}
