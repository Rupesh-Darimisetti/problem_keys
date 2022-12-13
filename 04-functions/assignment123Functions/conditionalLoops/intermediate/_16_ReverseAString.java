package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 16. Reverse A String In Java
public class _16_ReverseAString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a Word: ");
            String word = input.next();
            String reverse_word = reverseStringConverter(word);
            System.out.println("The reverse word for " + word + " = " + reverse_word);
        }
    }

    private static String reverseStringConverter(String word) {
        StringBuilder reverse_word = new StringBuilder();
        for (int ch = word.length() - 1; ch >= 0; ch--) {
            reverse_word.append(word.charAt(ch));
        }
        return reverse_word.toString();
    }
}
