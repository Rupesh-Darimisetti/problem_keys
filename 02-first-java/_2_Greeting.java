// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class _2_Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // take name as input from user
        String name = input.nextLine();
        // Display greeting
        System.out.println("Hello " + name + "!");
    }
}
