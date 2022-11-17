package basic;

import java.util.Scanner;

// 4 - Area of Isosceles Triangle
public class _4_AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of Isosceles Triangle: ");
        float base = input.nextFloat();

        System.out.print("Enter height of Isosceles Triangle: ");
        float height = input.nextFloat();

        double area = (base * height) / 2;
        System.out.println("The Area of Isosceles Triangle = " + area);
    }
}
