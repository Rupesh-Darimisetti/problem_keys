package intermediate;

// 25. Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class _25_EvenDaysOfAGivenMonth {
    public static void main(String[] args) {

        int totalDaysInAugust = 30;
        int count = 0;
        for (int date = 1; date <= totalDaysInAugust; date++) {
            if (date % 2 == 0)
                count++;
        }
        System.out.println("The number of days he can go out with his friends in the month of August = " + count);
    }
}
