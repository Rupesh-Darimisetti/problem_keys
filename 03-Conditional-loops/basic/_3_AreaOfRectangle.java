package basic;

import java.util.Scanner;

// 3 - area of Rectangle
public class _3_AreaOfRectangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter length of Rectangle: ");
            double length = input.nextDouble();

            System.out.print("Enter breath of Rectangle: ");
            double breath = input.nextDouble();

            double area = length * breath;
            System.out.println("Area of rectangle = " + area);
        }
    }
}
