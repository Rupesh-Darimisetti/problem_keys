package Intermediate;

import java.util.Scanner;

// 4. Calculate Discount Of Product
public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cost price/ List Price of product: ");;
        double list_Price = input.nextDouble();
        System.out.print("Enter selling price of product: ");
        double selling_price = input.nextDouble();
        double discount = list_Price - selling_price;
        double rate_of_discount = (discount / list_Price) * 100;
        System.out.println("The discount of product = "+ discount );
        System.out.println("The rate of discount = " + rate_of_discount + "%");
    }
}
