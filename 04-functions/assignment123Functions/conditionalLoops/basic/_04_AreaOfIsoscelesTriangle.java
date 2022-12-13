package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;

// 4 - Area of Isosceles Triangle
public class _04_AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter base of Isosceles Triangle: ");
            float base = input.nextFloat();
            System.out.print("Enter height of Isosceles Triangle: ");
            float height = input.nextFloat();
            double area = areaOfIsoscelesTriangle(base, height);
            System.out.println("The Area of Isosceles Triangle = " + area);
        }
    }

    private static float areaOfIsoscelesTriangle(float base, float height) {
        return (base * height) / 2;
    }
}
