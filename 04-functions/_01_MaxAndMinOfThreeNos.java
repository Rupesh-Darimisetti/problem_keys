import java.util.Scanner;

// 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class _01_MaxAndMinOfThreeNos {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Program to find maximum and minimum of three numbers");
            System.out.print("Enter First Number: ");
            double first_no = input.nextDouble();
            System.out.print("Enter Second Number: ");
            double second_no = input.nextDouble();
            System.out.print("Enter Third Number: ");
            double third_no = input.nextDouble();
            double maximum_of_three_nos = largest(first_no, second_no, third_no);
            double minimum_of_three_nos = smallest(first_no, second_no, third_no);
            System.out.println("Maximum Number from " + first_no + ", " + second_no + ", " + third_no + " = " + maximum_of_three_nos);
            System.out.println("Minimum Number from " + first_no + ", " + second_no + ", " + third_no + " = " + minimum_of_three_nos);
        }
    }

    private static double largest(double first_no, double second_no, double third_no) {
        double max = first_no;
        if (max < second_no) max = second_no;
        if (max < third_no) max = third_no;
        return max;
    }

    private static double smallest(double first_no, double second_no, double third_no) {
        double min = first_no;
        if (min > second_no) min = second_no;
        if (min > third_no) min = third_no;
        return min;
    }
}
