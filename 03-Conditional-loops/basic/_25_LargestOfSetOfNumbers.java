package basic;

import java.util.Scanner;

// 25. Take integer inputs till the user enters 0 and print the largest number from all.
public class _25_LargestOfSetOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers one after the other to find the largest number that you type\n");
        System.out.print("if you want to exit type 0\n");
        long max = 0L;
        long num = input.nextLong();
        while (num != 0) {
            max = Math.max(num, max);
            num = input.nextLong();
        }
        System.out.println("The max of all the numbers: " + max);
    }
}
