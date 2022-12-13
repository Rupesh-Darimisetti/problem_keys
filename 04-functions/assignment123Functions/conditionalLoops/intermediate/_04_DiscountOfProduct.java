package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 4. Calculate Discount Of Product
public class _04_DiscountOfProduct {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter cost price/ List Price of product: ");
            double list_Price = input.nextDouble();
            System.out.print("Enter selling price of product: ");
            double selling_price = input.nextDouble();
            double rate_of_discount = rateOfDiscount(list_Price, selling_price);
            System.out.println("The rate of discount = " + rate_of_discount + "%");
        }
    }

    private static double rateOfDiscount(double list_Price, double selling_price) {
        double discount = list_Price - selling_price;
        System.out.println("The discount of product = " + discount);
        return (discount / list_Price) * 100;
    }
}
