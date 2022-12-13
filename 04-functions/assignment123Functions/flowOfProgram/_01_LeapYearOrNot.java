package assignment123Functions.flowOfProgram;

import java.util.Scanner;

// 1.  Input a year and find  whether it is a leap year or not.
public class _01_LeapYearOrNot {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a year to check it is Leap Year or Not: ");
            int year = input.nextInt();
            String leap_year_or_not = leapYearNot(year);
            for (int years = 0; years <= year; years++) {
                String lep = leapYearNot(years);
                if (lep.equals("Leap Year")) {
                    System.out.print(years + "\t");
                }
            }
            System.out.println("the given year " + year + " is a " + leap_year_or_not);
        }
    }

    private static String leapYearNot(int year) {
        String message = "Not a Leap Year";
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            message = "Leap Year";
        }
        return message;
    }
}
