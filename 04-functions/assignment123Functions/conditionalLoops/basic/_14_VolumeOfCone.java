package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 14. Volume Of Cone Java Program
public class _14_VolumeOfCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of Cone: ");
        float radius = input.nextFloat();
        System.out.print("Enter height of Cone: ");
        float height = input.nextFloat();
        double volume_of_cone = volumeOfCone(radius, height);
        System.out.println("The Volume of Cone = " + volume_of_cone);
    }

    private static double volumeOfCone(float radius, float height) {
        return (Math.PI * Math.pow(radius, 2) * height) / 3;
    }
}
