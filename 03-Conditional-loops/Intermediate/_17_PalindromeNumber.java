package intermediate;

import java.util.Scanner;

// 17. Find if a number is palindrome or not
public class _17_PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a Number to check whether it is palindrome or not: ");
            long number = input.nextLong();
            long remainder, reverse = 0, realNum = number;
            while (number != 0) {
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number /= 10;

            }
            String message = (realNum == reverse) ? "The given no " + realNum + " is  a Palindrome"
                    : "The Given number " + realNum + " is Not a Palindrome";
            System.out.println(message);
        }
    }
}
