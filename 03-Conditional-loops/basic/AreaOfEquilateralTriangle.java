package basic;

import java.util.Scanner;
// 7 - Area of Equilateral triangle
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of equilateral Triangle: ");
        float side = input.nextFloat();
        double area = (Math.sqrt(3) * Math.pow(side, 2)) / 4;
        System.out.print("The area of Equilateral Triangle = " + area);
    }
}
