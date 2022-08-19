package basic;

import java.util.Scanner;
// 2 - area of scalance triangle
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of triangle: ");
        float first_side = sc.nextFloat();
        System.out.print("Enter first side of triangle: ");
        float second_side = sc.nextFloat();
        System.out.print("Enter first side of triangle: ");
        float third_side = sc.nextFloat();

        double semi_perimeter  = (first_side + second_side + third_side) / 2;

        double area = Math.sqrt(semi_perimeter *
                (semi_perimeter - first_side) *
                (semi_perimeter - second_side) *
                (semi_perimeter - third_side));
        System.out.print("Area of Traingle = " + area);
    }
}
