import java.util.Scanner;

// 10. Write a function to find if a number is a palindrome or not. Take number as a parameter.
public class _10_PalindromeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find is it palindrome or not: ");
        int num = input.nextInt();
        String palindrome_or_not = palindromeOrNot(num);
        System.out.println("The given number " + num + " is a " + palindrome_or_not);
    }

    private static String palindromeOrNot(int num) {
        String message;
        int real_num = num, sum = 0;
        while (num > 0) {
            int res = num % 10;
            sum = sum * 10 + res;
            num /= 10;
        }
        message = (sum == real_num) ? "Palindrome Number" : "Non Palindrome Number";
        return message;
    }
}
