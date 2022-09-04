package assignment123Functions.firstJava;
import java.util.Scanner;
// 2. Take name as input and print a greeting message for that particular name.
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        // take name as input from user
        String name = input.nextLine();
        greetingMessage(name);
    }

    private static void greetingMessage(String name) {
        // Display greeting
        System.out.println("Hello " + name + "!");
    }
}
