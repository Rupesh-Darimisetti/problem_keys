package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 10. perimeter of parallelogram
public class _10_PerimeterOfParallelogram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter length of parallelogram: ");
            float length = input.nextFloat();
            System.out.print("Enter breath of parallelogram: ");
            float breath = input.nextFloat();
            double perimeter_of_parallelogram = perimeterOfParallelogram(length, breath);
            System.out.println("The perimeter of parallelogram = " + perimeter_of_parallelogram);
        }
    }

    private static float perimeterOfParallelogram(float length, float breath) {
        return 2 * (length + breath);
    }
}
