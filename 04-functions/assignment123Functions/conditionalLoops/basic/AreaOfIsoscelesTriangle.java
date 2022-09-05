package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 4 - Area of Isosceles Triangle
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of Isosceles Triangle: ");
        float base = input.nextFloat();
        System.out.print("Enter height of Isosceles Triangle: ");
        float height = input.nextFloat();
        double area = areaOfIsocelesTriangle(base, height);
        System.out.println("The Area of Isoceles Triangle = " + area);
    }
    private static float areaOfIsocelesTriangle(float base, float height) {
        return (base * height) / 2;
    }
}
