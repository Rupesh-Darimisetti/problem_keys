package assignment123Functions.firstJava;

import java.util.Scanner;

public class _08_Palindrome {
    public static void main(String[] args) {
        final String name;
        String reverseName = "";
        final String message;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            name = input.next();
        }
        int len = name.length();
        reverseName = reverseName(name, reverseName, len);
        message = (name.equals(reverseName)) ? "The String " + name + " is a Palindrome"
                : "The String " + name + " is not a Palindrome";
        System.out.println(message);
    }

    private static String reverseName(String name, String reverseName, int len) {
        StringBuilder reverseNameBuilder = new StringBuilder(reverseName);
        for (int ch = len - 1; ch >= 0; ch--) {
            reverseNameBuilder.append(name.charAt(ch));
        }
        reverseName = reverseNameBuilder.toString();
        return reverseName;
    }
}
