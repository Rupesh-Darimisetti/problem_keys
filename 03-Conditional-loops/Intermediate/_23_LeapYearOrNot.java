package intermediate;

import java.util.Scanner;

// 23. Check Leap Year Or Not
public class _23_LeapYearOrNot {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a year to know it is a leap year or not:\t");
            int year = input.nextInt();
            String message = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ?
                    "The year " + year + " is a leap year" :
                    "The year " + year + " is not a leap year.";
            System.out.println(message);
        }
    }
}
