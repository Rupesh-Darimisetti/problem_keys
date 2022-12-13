package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// Calculate Distance Between Two Points
public class _05_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter x1 :");
            float x1 = input.nextFloat();
            System.out.print("Enter y1: ");
            float y1 = input.nextFloat();
            System.out.print("Enter x2: ");
            float x2 = input.nextFloat();
            System.out.print("Enter y2: ");
            float y2 = input.nextFloat();
            double distance_between_two_points = distanceBetweenTwoPoints(x1, y1, x2, y2);
            System.out.println("The Distance between two points = " + distance_between_two_points);
        }
    }

    private static double distanceBetweenTwoPoints(float x1, float y1, float x2, float y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
