package intermediate;

import java.util.Scanner;

// 3. Calculate Average Of N Numbers
public class _03_AverageOfNNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter 0 to exit or numbers to sum up and find the average until you enter 0 to exit");
            long sum = 0L, count = 1L;
            long num = input.nextLong();
            while (num != 0) {
                sum += num;
                count += 1;
                num = input.nextLong();
            }
            long average = sum / count;
            System.out.print("The Average of N numbers = " + average);
        }
    }
}
