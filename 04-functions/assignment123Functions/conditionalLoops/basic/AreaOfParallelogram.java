package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 5 - Area of parallelogram
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of parallelogram: ");
        float base = input.nextFloat();
        System.out.print("Enter height of parallelogram: ");
        float height = input.nextFloat();
        double area = areaOfParallelogram(base, height);
        System.out.print("The area of parallelogram = " + area);
    }

    private static float areaOfParallelogram(float base, float height) {
        return base * height;
    }
}
