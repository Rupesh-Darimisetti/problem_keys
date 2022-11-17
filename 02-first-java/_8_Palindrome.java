import java.util.Scanner;

public class _8_Palindrome {
    public static void main(String[] args) {
        final String name;
        StringBuilder reverseName = new StringBuilder();
        final String message;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        name = input.next();

        int len = name.length();

        for (int ch = len - 1; ch >= 0; ch--) {
            reverseName.append(name.charAt(ch));
        }

        message = (name.equals(reverseName.toString())) ? "The String " + name + " is a Palindrome"
                : "The String " + name + " is not a Palindrome";

        System.out.println(message);
    }
}
