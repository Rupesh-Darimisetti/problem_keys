package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 23. Input a number and print all the factors of that number (use loops).
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find all its factors: ");
        long num = input.nextLong();
        System.out.print("The factors of " + num + " = 1 ");
        factors(num);
    }
    private static void factors(long num) {
        for (long val = 2; val <= num; val++) {
            if(num % val == 0){
                System.out.print(" " + val);
            }
        }
    }
}