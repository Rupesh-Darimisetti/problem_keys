package Intermediate;

import java.util.Scanner;
// 16. Reverse A String In Java
public class ReverseAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word = input.next();
        String reverse_word = "";
        for (int ch = word.length() - 1; ch >= 0; ch--){ 
            reverse_word += word.charAt(ch);
        }
        System.out.println("The reverse word for " + word + " = " + reverse_word);
    }
}
