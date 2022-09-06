package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;
// 18. Future Investment Value
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Following Details to fid  future value of product");
        System.out.print("Enter present Vaslue of product: ");
        double present_value = input.nextDouble();
        System.out.print("Enter Rate Of Interest: ");
        float rate_of_intrest = input.nextFloat() / 100;
        System.out.print("Enter Number of Years the investment held: ");
        float time_in_years = input.nextFloat();
        double future_value = futureValue(present_value, rate_of_intrest, time_in_years);
        System.out.println("The future value = " + future_value);
    }
    private static double futureValue(double present_value, float rate_of_intrest, float time_in_years) {
        return present_value * Math.pow((1 + rate_of_intrest), time_in_years);
    }
}
