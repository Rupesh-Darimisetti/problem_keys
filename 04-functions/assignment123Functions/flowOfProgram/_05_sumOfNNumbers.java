package assignment123Functions.flowOfProgram;

import java.util.Scanner;

// 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class _05_sumOfNNumbers {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter numbers if you want to exit type x: ");
        String exit_status = input.next();
        long total = sum(exit_status);
        System.out.println("The total of all numbers = " + total);
    }

    private static long sum(String exit) {
        String exit_status = exit.toLowerCase();
        if (exit_status.charAt(0) == 'x') return 0;
        int sum = 0;
        sum += Integer.parseInt(exit);
        do {
            exit_status = input.next();
//            exit_status = exit_status.toLowerCase();
            if (exit_status.charAt(0) == 'x') {
                break;
            } else {
                sum += (exit_status.charAt(0) >= 'a' && exit_status.charAt(0) <= 'z') ? Integer.parseInt(exit_status) : 0;
            }
        } while (exit_status.charAt(0) != 'x');
        return sum;
    }
}
