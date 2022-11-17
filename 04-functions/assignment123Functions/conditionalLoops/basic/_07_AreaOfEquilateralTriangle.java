package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 7 - Area of Equilateral triangle
public class _07_AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of equilateral Triangle: ");
        float side = input.nextFloat();
        double area = areaOfEquilateralTriangle(side);
        System.out.print("The area of Equilateral Triangle = " + area);
    }

    private static double areaOfEquilateralTriangle(float side) {
        return (Math.sqrt(3) * Math.pow(side, 2)) / 4;
    }
}
