import java.util.Scanner;

// 13. Write a function that returns all prime numbers between two given numbers.
public class _13_PrimeNumbersBetweenTwoGivenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Start Number of Prime Number: ");
        int start_prime = input.nextInt();
        System.out.print("Enter End Number of Prime Number: ");
        int end_prime = input.nextInt();
        System.out.println("The Prime Number between " + start_prime + " and " + end_prime + " : ");
        for (int num = start_prime; num <= end_prime; num++) {
            int prime_no = primeNonePrime(num);
            if (prime_no != 0) System.out.print(prime_no + "\t");
        }
    }

    private static int primeNonePrime(int num) {
        boolean flag = true;
        int message;
        if (num == 0 || num == 1) {
            return 0;
        }
        for (int val = 2; val <= Math.sqrt(num); val++) {
            if (num % val == 0) {
                flag = false;
                break;
            }
        }
        message = flag ? num : 0;
        return message;
    }
}
