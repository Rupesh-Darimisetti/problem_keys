package basic;

import java.util.Scanner;

// 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop
public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to exit or numbers to sum up until you enter 0 to exit");
        long sum = 0L;
        long num = input.nextLong();
        while(num !=0){
            sum += num;
            num = input.nextLong();
        }
        System.out.print("print sum of nos = " + sum);
    }
}
