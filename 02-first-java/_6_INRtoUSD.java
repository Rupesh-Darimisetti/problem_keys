// 6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class _6_INRtoUSD {

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      double inr, usd;
      System.out.print("Enter currency in rupees: ");
      inr = input.nextDouble();
      usd = (inr * 0.013);
      System.out.print("Currency in USD: " + usd);
    }
  }
}
