package Intermediate;

import java.util.Scanner;

// 13. Sum Of N Numbers
public class SumOfNNumbers {
    public static void main(String[] args) {
   Scanner imput = new Scanner(System.in);
        System.out.print("Enter total numbers of Numbers you want to Enter: ");
        int total = imput.nextInt();
        long num = imput.nextLong();
        long sum = 0, val = 0;
        while(val <= total){
            sum += num;
            num = imput.nextLong();
            val++;
        }
        System.out.println("The total sum of " + total + " numbers = " + sum);
    }
}
