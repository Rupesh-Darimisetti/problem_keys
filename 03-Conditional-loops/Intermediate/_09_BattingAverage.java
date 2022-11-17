package intermediate;

import java.util.Scanner;

// 9. Calculate Batting Average
public class _09_BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Total Balls: ");
        long balls = input.nextLong();
        System.out.print("Enter total Hits for all " + balls + " balls: ");
        double hits = input.nextLong();
        while (hits > balls) {
            System.out.print("Please enter hits less than are equal to total " + balls + " balls: ");
            hits = input.nextDouble();
        }
        double batting_average = hits / balls;
        System.out.println("The Batting average for " + balls + " balls" +
                " and " + hits + " hits  = " + batting_average);
    }
}
