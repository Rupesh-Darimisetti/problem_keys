package basic;

import java.util.Scanner;

// 20. Total Surface Area Of Cube
public class _20_TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of Cube: ");
        float side = input.nextFloat();
        double total_surface_area_of_cube = 6 * Math.pow(side, 2);
        System.out.println("Total Surface Area of Cube = " + total_surface_area_of_cube);
    }
}
