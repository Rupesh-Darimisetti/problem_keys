package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 3 - area of Rectangle
public class _03_AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter breath of Rectangle: ");
        double breath = input.nextDouble();

        double area = areaOfRectangle(length, breath);
        System.out.println("Area of rectangle = " + area);
    }

    private static double areaOfRectangle(double length, double breath) {
        return length * breath;
    }
}
