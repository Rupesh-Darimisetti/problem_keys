import java.util.Scanner;

// 2. Define a program to find out whether a given number is even or odd.
public class _02_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find Even or odd: ");
        long num = input.nextLong();
        String even_or_odd = even_odd(num);
        System.out.println("The given number " + num + " is " + even_or_odd);
    }

    private static String even_odd(long num) {
        return (num % 2 == 0) ? "Even Number" : "Odd Number";
    }
}
