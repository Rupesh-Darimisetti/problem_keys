package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 19. Curved Surface Area Of Cylinder
public class _19_CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter radius of Cylinder: ");
            float radius = input.nextFloat();
            System.out.print("Enter height of Cylinder: ");
            float height = input.nextFloat();
            double curved_surface_area_of_cylinder = curvedSurfaceAreaOfCylinder(radius, height);
            System.out.println("Curved Surface Area of Cylinder = " + curved_surface_area_of_cylinder);
        }
    }

    private static double curvedSurfaceAreaOfCylinder(float radius, float height) {
        return 2 * Math.PI * radius * height;
    }
}
