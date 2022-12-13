package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 12. perimeter of square
public class _12_PerimeterOfSquare {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter side of Square: ");
            float side_of_square = input.nextFloat();
            double perimeter_of_square = perimeterOfSquare(side_of_square);
            System.out.println("The perimeter of square is " + perimeter_of_square);
        }
    }

    private static float perimeterOfSquare(float side_of_square) {
        return 4 * side_of_square;
    }
}
