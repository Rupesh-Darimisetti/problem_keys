package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 16. Volume Of Cylinder
public class _16_VolumeOfCylinder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter radius of Cylinder: ");
            float radius = input.nextFloat();
            System.out.print("Enter height of Cylinder: ");
            float height = input.nextFloat();
            double volume_of_cylinder = volumeOfCylinder(radius, height);
            System.out.println("Volume of Cylinder = " + volume_of_cylinder);
        }
    }

    private static double volumeOfCylinder(float radius, float height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
