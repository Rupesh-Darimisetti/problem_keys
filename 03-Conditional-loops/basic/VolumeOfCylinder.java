package basic;

import java.util.Scanner;

// 16. Volume Of Cylinder
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of Cylinder: ");
        float radius = input.nextFloat();
        System.out.print("Enter height of Cylinder: ");
        float height = input.nextFloat();
        double volume_of_cylinder = Math.PI * Math.pow(radius,2) * height;
        System.out.println("Volume of Cylinder = " + volume_of_cylinder);
    }
}
