package basic;

import java.util.Scanner;
// 6 - Area of Rhombus
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first diagonal length of Rhombus: ");
        float first_diagonal = input.nextFloat();
        System.out.print("Enter second diagonal length of Rhombus: ");
        float second_diagonal = input.nextFloat();
        double area = (first_diagonal * second_diagonal)/ 2;
        System.out.println("The area of Rhombus = " + area);
    }
}
