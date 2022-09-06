package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;
// 17. Find if a number is palindrome or not
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to check whether it is palindrome or not: ");
        long number = input.nextLong();
        long reverse = 0;
        reverse = palindromeChecker(number, reverse);
        String message= (number == reverse) ?
               "The given no "+ number +" is a Palindrome":
               "The Given number "+ number +" is Not a Palindrome";
        System.out.println(message);
    }
    private static long palindromeChecker(long number, long reverse) {
        long remainder;
        while(number != 0){
            remainder = number % 10;
            reverse =  reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }
}
