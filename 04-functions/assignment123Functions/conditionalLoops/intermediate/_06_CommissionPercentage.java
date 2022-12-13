package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 6. Calculate Commission Percentage
public class _06_CommissionPercentage {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Sales Price: ");
            double sales_price = input.nextDouble();
            System.out.print("Enter Commission: ");
            double commission = input.nextDouble();
            double commission_rate = commissionRate(sales_price, commission);
            System.out.println("The Commission rate he/she got = " + commission_rate + "%");
        }
    }

    private static double commissionRate(double sales_price, double commission) {
        return (commission / sales_price) * 100;
    }
}
