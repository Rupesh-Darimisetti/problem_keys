package basic;

import java.util.Scanner;

// 12. perimeter of square
public class _12_PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        float side_of_square = input.nextFloat();
        double perimeter_of_square = 4 * side_of_square;
        System.out.println("The perimeter of square is " + perimeter_of_square);
    }
}
