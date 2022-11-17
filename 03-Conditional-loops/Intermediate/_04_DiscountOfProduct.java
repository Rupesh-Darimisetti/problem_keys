package intermediate;

import java.util.Scanner;

// 4. Calculate Discount Of Product
public class _04_DiscountOfProduct {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter cost price/ List Price of product: ");
            double listPrice = input.nextDouble();
            System.out.print("Enter selling price of product: ");
            double sellingPrice = input.nextDouble();
            double discount = listPrice - sellingPrice;
            double rateOfDiscount = (discount / listPrice) * 100;
            System.out.println("The discount of product = " + discount);
            System.out.println("The rate of discount = " + rateOfDiscount + "%");
        }
    }
}
