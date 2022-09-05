package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 17. Volume Of Sphere
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of Sphere: ");
        float radius = input.nextFloat();
        double vol_of_sphere = volumeOfSphere(radius);
        System.out.println("Volume of sphere = " + vol_of_sphere);
    }
    private static double volumeOfSphere(float radius) {
        return 4 * (Math.PI * Math.pow(radius, 3)) / 3;
    }
}
