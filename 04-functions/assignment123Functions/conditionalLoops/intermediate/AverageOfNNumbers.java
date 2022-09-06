package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 3. Calculate Average Of N Numbers
public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 to exit or numbers to sum up and find the average until you enter 0 to exit");
        long num = input.nextLong();
        double average = averageOfNumbers(input, num);
        System.out.print("The Average of N numbers = " + average);
    }
    private  static  double averageOfNumbers(Scanner input,long num){
        long sum = 0L, count = 1L;
        while(num !=0){
            sum += num;
            count += 1;
            num = input.nextLong();
        }
        return (float)sum /count;
    }
}
