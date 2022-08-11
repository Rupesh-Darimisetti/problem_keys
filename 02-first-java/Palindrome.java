
/** 8. To find out whether the given String is Palindrome or not.
    * To find out whether the given String is Palindrome or not.
    */
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        final String name;
        String reverseName = "";
        final String message;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        name = input.next();

        int len = name.length();

        for (int ch = len - 1; ch >= 0; ch--) {
            reverseName += name.charAt(ch);
        }

        message = (name.equals(reverseName)) ? "The String " + name + " is a Palindrome"
                : "The String " + name + " is not a Palindrome";

        System.out.println(message);
    }
}
