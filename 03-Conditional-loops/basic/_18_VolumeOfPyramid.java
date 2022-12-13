package basic;

import java.util.Scanner;

//18. Volume Of Pyramid
public class _18_VolumeOfPyramid {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter length of Pyramid: ");
            float length = input.nextFloat();
            System.out.print("Enter breath of Pyramid: ");
            float breath = input.nextFloat();
            System.out.print("Enter height of Pyramid:");
            float height = input.nextFloat();
            double vol_of_pyramid = (length * breath * height) / 3;
            System.out.println("The volume of Pyramid = " + vol_of_pyramid);
        }
    }
}
