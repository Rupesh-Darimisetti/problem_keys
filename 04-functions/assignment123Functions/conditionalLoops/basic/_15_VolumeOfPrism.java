package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 15. Volume Of Prism
public class _15_VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Prism: ");
        float length = input.nextFloat();
        System.out.print("Enter breath of Prism: ");
        float breath = input.nextFloat();
        System.out.print("Enter height of Prism: ");
        float height = input.nextFloat();
        double volume_of_rec_prism = volumeOfRecPrism(length, breath, height);
        System.out.println("Volume of Prism = " + volume_of_rec_prism);
    }

    private static float volumeOfRecPrism(float length, float breath, float height) {
        return length * breath * height;
    }
}
