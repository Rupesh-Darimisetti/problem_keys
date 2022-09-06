package assignment123Functions.conditionalLoops.intermediate;

// 25. Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class EvenDaysOfAGivenMonth {
    public static void main(String[] args) {

        int total_days_in_august = 30;
        int count = 0;
        count = evenDayOfAMonth(total_days_in_august, count);
        System.out.println("The number of days he can go out with his friends in the month of August = " + count);
    }
    private static int evenDayOfAMonth(int total_days_in_august, int count) {
        for (int date = 1; date <= total_days_in_august; date++) {
            if(date % 2 == 0)
                count++;
        }
        return count;
    }
}
