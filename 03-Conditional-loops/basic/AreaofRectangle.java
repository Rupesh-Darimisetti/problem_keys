package basic;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of Rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter breath of Rectangle: ");
        double breath = input.nextDouble();

        double area = length * breath;
        System.out.println("Area of rectangle = " + area);
    }
}
