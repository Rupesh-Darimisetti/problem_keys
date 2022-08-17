package basic;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of Traingle: ");
        double base = input.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.print("Area of triangle: "+ area);
    }
}
