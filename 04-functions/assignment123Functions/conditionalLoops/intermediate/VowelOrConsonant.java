package Intermediate;

import java.util.Scanner;
// 21. Java Program Vowel Or Consonant
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character to check is it Vowel or constant: ");
        char alph = input.next().charAt(0);
        String message;
        if ((alph == 'a') || (alph == 'e') || (alph == 'i') || (alph == 'o') || (alph == 'u')
                || (alph == 'A') || (alph == 'E') || (alph == 'I') || (alph == 'O') || (alph == 'U')){
            message = "The given character " + alph + " is a Vowel";
        }
        else {
            message ="The given character " + alph + " is a Constant";
        }
        System.out.println(message);
    }
}
