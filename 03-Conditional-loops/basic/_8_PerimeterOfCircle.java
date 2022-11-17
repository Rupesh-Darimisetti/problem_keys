package basic;

import java.util.Scanner;

// 8. perimeter of circle
public class _8_PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle: ");
        float radius = input.nextFloat();
        double perimeter_of_circle = 2 * Math.PI * radius;
        System.out.println("The area of circle with radius " + radius + " = " + perimeter_of_circle);
    }
}
