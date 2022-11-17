package intermediate;

import java.util.Scanner;

// 13. Sum Of N Numbers
public class _13_SumOfNNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter total numbers of Numbers you want to Enter: ");
            int total = input.nextInt();
            long num = input.nextLong();
            long sum = 0, val = 0;
            while (val <= total) {
                sum += num;
                num = input.nextLong();
                val++;
            }
            System.out.println("The total sum of " + total + " numbers = " + sum);
        }
    }
}
