package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 6 - Area of Rhombus
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first diagonal length of Rhombus: ");
        float first_diagonal = input.nextFloat();
        System.out.print("Enter second diagonal length of Rhombus: ");
        float second_diagonal = input.nextFloat();
        double area = areaOfRhombus(first_diagonal, second_diagonal);
        System.out.println("The area of Rhombus = " + area);
    }
    private static float areaOfRhombus(float first_diagonal, float second_diagonal) {
        return (first_diagonal * second_diagonal) / 2;
    }
}
