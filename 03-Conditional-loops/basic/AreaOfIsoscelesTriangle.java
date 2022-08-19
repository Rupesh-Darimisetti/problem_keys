package basic;

import java.util.Scanner;
// 4 - Area of Isosceles Triangle
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of Isoceles Triangle: ");
        float base = input.nextFloat();

        System.out.print("Enter height of Isoceles Triangle: ");
        float height = input.nextFloat();

        double area = (base * height) / 2;
        System.out.println("The Area of Isoceles Triangle = " + area);
    }
}
