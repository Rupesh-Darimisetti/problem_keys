import java.util.Scanner;

// 14. Write a function that returns the sum of first n natural numbers.
public class _14_SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to find sum of First N Natural Numbers: ");
            int num = input.nextInt();
            long sum = sum(num);
            System.out.println("sum = " + sum);
            long naturalNumbersSum = sumOfNaturalNos(num);
            System.out.println("The sum of First " + num + " numbers = " + naturalNumbersSum);
        }
    }

    private static long sumOfNaturalNos(int num) {
        long sum = 0L;
        for (int val = 1; val < num; val++) {
            sum += val;
        }
        return sum;
    }

    // optimized code
    private static long sum(int num) {
        return (long) num * (num - 1) / 2;
    }
}
