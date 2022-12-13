import java.util.Scanner;

// 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class _06_CircumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Program to Find Area and Circumference of a Circle with Given Radius");
            System.out.print("Enter Radius of a Circle: ");
            double radius = input.nextDouble();
            double area_of_circle = areaOfCircle(radius);
            double perimeter_of_circle = perimeterOfCircle(radius);
            System.out.println("The Area of Circle with " + radius + " radius = " + area_of_circle);
            System.out.println("The Perimeter ofCircle with " + radius + " radius = " + perimeter_of_circle);
        }
    }

    private static double perimeterOfCircle(double radius) {
        return Math.PI * radius * 2;
    }

    private static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
