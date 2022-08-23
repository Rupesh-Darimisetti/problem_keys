package Intermediate;

import java.util.Scanner;

// 6. Calculate Commission Percentage
public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sales Price: ");
        double sales_price = input.nextDouble();
        System.out.print("Enter Commision: ");
        double commission = input.nextDouble();
        double commission_rate = (commission / sales_price) * 100;
        System.out.println("The Commision rate he/she got = " + commission_rate + "%");
    }
}
