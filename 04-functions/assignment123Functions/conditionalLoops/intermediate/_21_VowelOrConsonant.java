package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 21. Java Program Vowel Or Consonant
public class _21_VowelOrConsonant {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a character to check is it Vowel or constant: ");
            char alphabet = input.next().charAt(0);
            String message;
            message = charTypeChecker(alphabet);
            System.out.println(message);
        }
    }

    private static String charTypeChecker(char alphabet) {
        String message;
        if ((alphabet == 'a') || (alphabet == 'e') || (alphabet == 'i') || (alphabet == 'o') || (alphabet == 'u')
                || (alphabet == 'A') || (alphabet == 'E') || (alphabet == 'I') || (alphabet == 'O') || (alphabet == 'U')) {
            message = "The given character " + alphabet + " is a Vowel";
        } else {
            message = "The given character " + alphabet + " is a Constant";
        }
        return message;
    }
}
