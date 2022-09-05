package assignment123Functions.conditionalLoops.basic;

import java.util.Scanner;
// 20. Total Surface Area Of Cube
public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of Cube: ");
        float side = input.nextFloat();
        double total_surface_area_of_cube = cubeTSA(side);
        System.out.println("Total Surface Area of Cube = " + total_surface_area_of_cube);
    }
    private static double cubeTSA(float side) {
        return 6 * Math.pow(side, 2);
    }
}
