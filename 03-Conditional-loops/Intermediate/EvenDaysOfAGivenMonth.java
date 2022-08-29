package Intermediate;

import java.util.Scanner;

// 25. Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class EvenDaysOfAGivenMonth {
    public static void main(String[] args) {

        int total_days_in_august = 30;
        int count = 0;
        for (int date = 1; date <= total_days_in_august; date++) {
            if(date % 2 == 0)
                count++;
        }
        System.out.println("The number of days he can go out with his friends in the month of August = " + count);
    }
}
