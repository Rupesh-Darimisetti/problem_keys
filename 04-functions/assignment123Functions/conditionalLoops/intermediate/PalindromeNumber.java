package Intermediate;

import java.util.Scanner;
// 17. Find if a number is palindrome or not
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number to check whether it is palindrome or not: ");
        long number = input.nextLong();
        long remainder, reverse = 0, real_num = number;
        while(number != 0){
            remainder = number % 10;
            reverse =  reverse * 10 + remainder;
            number /= 10;
        }
       String message= (real_num == reverse) ?
               "The given no "+ real_num +" is a Palindrome":
               "The Given number "+ real_num +" is Not a Palindrome";
        System.out.println(message);
    }
}
