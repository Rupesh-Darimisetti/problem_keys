package basic;

import java.util.Scanner;

// 5 - Area of parallelogram
public class _5_AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of parallelogram: ");
        float base = input.nextFloat();
        System.out.print("Enter height of parallelogram: ");
        float height = input.nextFloat();
        double area = base * height;
        System.out.print("The area of parallelogram = " + area);
    }
}
