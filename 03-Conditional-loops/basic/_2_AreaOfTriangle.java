package basic;

import java.util.Scanner;

// 2 - area of scalene triangle
public class _2_AreaOfTriangle {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter FIRST SIDE of triangle: ");
            float firstSide = in.nextFloat();
            System.out.print("Enter SECOND SIDE of triangle: ");
            float secondSide = in.nextFloat();
            System.out.print("Enter THIRD SIDE of triangle: ");
            float thirdSide = in.nextFloat();

            double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;

            double area = Math.sqrt(semiPerimeter *
                    (semiPerimeter - firstSide) *
                    (semiPerimeter - secondSide) *
                    (semiPerimeter - thirdSide));
            System.out.print("Area of Triangle = " + area);
        }
    }
}
