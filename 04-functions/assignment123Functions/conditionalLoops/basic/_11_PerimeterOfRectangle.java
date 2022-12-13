package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 11. perimeter of rectangle
public class _11_PerimeterOfRectangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter length of Rectangle: ");
            float length = input.nextFloat();
            System.out.print("Enter breath of Rectangle: ");
            float breath = input.nextFloat();
            double perimeter_of_Rectangle = perimeterOfRectangle(length, breath);
            System.out.println("The perimeter of Rectangle = " + perimeter_of_Rectangle);
        }
    }

    private static float perimeterOfRectangle(float length, float breath) {
        return 2 * (length + breath);
    }
}
