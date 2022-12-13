package assignment123Functions.firstJava;

// 6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class _06_INRtoUSD {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double inr, usd;
            System.out.print("Enter currency in rupees: ");
            inr = input.nextDouble();
            usd = inrToUSD(inr);
            System.out.print("Currency in USD: " + usd);
        }
    }

    private static double inrToUSD(double inr) {
        return (inr * 0.013);
    }
}
