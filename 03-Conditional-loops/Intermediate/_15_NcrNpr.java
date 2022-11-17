package intermediate;

import java.util.Scanner;

// 15. Find Ncr & Npr
public class _15_NcrNpr {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter C for nCr or P for nPr: ");
            char operation = input.next().charAt(0);
            System.out.print("Enter Total Number of Items: ");
            long num = input.nextLong();
            System.out.print("Enter Items Taken into consideration: ");
            long rNum = input.nextLong();
            double ncr, npr;
            if (operation == 'C' || operation == 'c') {
                ncr = (float) factorial(num) / (factorial(rNum) * factorial(num - rNum));
                System.out.println("The value of " + num + "C" + rNum + " = " + ncr);
            }
            if (operation == 'P' || operation == 'p') {
                npr = (float) factorial(num) / factorial(num - rNum);
                System.out.print("The value of " + num + "P" + rNum + " = " + npr);
            }
        }
    }

    private static long factorial(long num) {
        return num == 0 ? 1 : (num * factorial(num - 1));
    }
}
