package Intermediate;

import java.util.Scanner;
// 7. Power In Java
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double num = input.nextDouble();
        System.out.print("Enter power/ times the value: ");
        double pow = input.nextDouble();
        double value = 1;
        while(pow != 0){
            value *= num;
            pow--;
        }
        System.out.println("The power of " + num + " to the " + pow + " = " + value);
    }
}
