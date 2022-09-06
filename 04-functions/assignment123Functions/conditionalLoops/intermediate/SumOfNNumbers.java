package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 13. Sum Of N Numbers
public class SumOfNNumbers {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.print("Enter total numbers of Numbers you want to Enter: ");
        int total = input.nextInt();
        long num = input.nextLong();
        long sum = 0, val = 0;
        sum = sumOfNumbers(input, total, num, sum, val);
        System.out.println("The total sum of " + total + " numbers = " + sum);
    }
    private static long sumOfNumbers(Scanner input, int total, long num, long sum, long val) {
        while(val <= total){
            sum += num;
            num = input.nextLong();
            val++;
        }
        return sum;
    }
}
