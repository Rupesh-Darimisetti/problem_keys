package basic;

import java.util.Scanner;

// 15. Volume Of Prism
public class _15_VolumeOfPrism {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter length of Prism: ");
            float length = input.nextFloat();
            System.out.print("Enter breath of Prism: ");
            float breath = input.nextFloat();
            System.out.print("Enter height of Prism: ");
            float height = input.nextFloat();
            double volume_of_rec_prism = length * breath * height;
            System.out.println("Volume of Prism = " + volume_of_rec_prism);
        }
    }
}
