package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 9. Calculate Batting Average
public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Total Balls: ");
        long balls = input.nextLong();
        System.out.print("Enter total Hits for all " +balls + " balls: ");
        double hits = input.nextLong();
        double batting_average = battingAverage(input, balls, hits);
        System.out.println("The Batting average for " + balls + " balls"+
                " and " + hits + " hits  = " + batting_average);
    }
    private static double battingAverage(Scanner input, long balls, double hits) {
        while(hits > balls) {
            System.out.print("Please enter hits less tham are equal to total " + balls + " balls: ");
            hits = input.nextDouble();
        }
        return hits / balls;
    }
}
