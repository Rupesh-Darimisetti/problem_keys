package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 9. perimeter of equilateral triangle
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Enter side of Equilateral Triangle: ");
        float side = input.nextFloat();
        double perimeter_of_equilateral_triangle = perimeterOfEquilateralTriangle(side);
        System.out.print("The perimeter o Equilateral triangle " + side + " = " + perimeter_of_equilateral_triangle);
    }
    private static float perimeterOfEquilateralTriangle(float side) {
        return (3 * side);
    }
}
