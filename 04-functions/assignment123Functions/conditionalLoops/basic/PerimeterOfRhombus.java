package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 13. perimater of rhombus
public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First diagonal of Rhombus: ");
        float first_diagonal = input.nextFloat() / 2;
        System.out.print("Enter Second diagonal of Rhombus: ");
        float second_diagonal = input.nextFloat() / 2 ;
        double perimeter_of_rhombus = perimeterOfRhombus(first_diagonal, second_diagonal);
        System.out.println("The perimeter of rhombus is " + perimeter_of_rhombus);
    }
    private static double perimeterOfRhombus(double first_diagonal, double second_diagonal) {
        double side_of_rhombus = Math.sqrt(Math.pow(first_diagonal,2) + Math.pow(second_diagonal, 2));
        return 4 * side_of_rhombus;
    }
}
