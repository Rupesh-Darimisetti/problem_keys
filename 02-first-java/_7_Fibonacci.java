import java.util.Scanner;

public class _7_Fibonacci {
    public static void main(String[] args) {
        final int num;
        int sum = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        System.out.print("Fibonacci Series: ");
        while (fibonacci(sum) <= num) {
            System.out.print(fibonacci(sum) + " ");
            sum++;
        }
    }

    public static int fibonacci(int num) {
        if (num <= 1) return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
