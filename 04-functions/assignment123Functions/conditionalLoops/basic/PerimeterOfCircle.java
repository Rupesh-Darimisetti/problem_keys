package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 8. perimeter of circle
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of Circle: ");
        float radius = input.nextFloat();
        double perimeter_of_circle = perimeterOfCircle(radius);
        System.out.println("The area of circle with radius " + radius + " = " + perimeter_of_circle);
    }
    private static double perimeterOfCircle(float radius) {
        return 2 * Math.PI * radius;
    }
}
