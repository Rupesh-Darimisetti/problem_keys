package basic;

import java.util.Scanner;
// 1 - Are of circle
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.print("The area of circle with radius " + radius + " = "+ area);
    }
}
