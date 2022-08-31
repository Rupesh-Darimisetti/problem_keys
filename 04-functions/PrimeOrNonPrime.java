import java.math.BigInteger;
import java.util.Scanner;

// 7.  Define a method to find out if a number is prime or not.
public class PrimeOrNonPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program to find a Number is prime or not");
        System.out.print("Enter a Number: ");
        long num = input.nextLong();
        String prime_or_nonprime = primeNonePrime(num);
        System.out.println("The Given number " + num + " is a " + prime_or_nonprime);
    }

    private static String primeNonePrime(long num) {
        boolean flag = true;
        String message;
        if (num == 0 || num == 1){
            return "Neither Prime nor Composite";
        }
        for (int val = 2; val <= Math.sqrt(num); val++) {
            if (num % val == 0) {
                flag = false;
                break;
            }
        }
         message = flag ? " Prime Number" : "Nom Prime Number";
        return message;
    }
}
