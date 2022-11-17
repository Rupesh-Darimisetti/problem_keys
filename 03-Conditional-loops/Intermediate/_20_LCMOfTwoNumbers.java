package intermediate;

import java.util.Scanner;

// 20. LCM Of Two Numbers
public class _20_LCMOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Two values to find LCM");
            System.out.print("Enter First Number: ");
            long numOne = input.nextLong();
            System.out.print("Enter Second Number: ");
            long numTwo = input.nextLong();
            long hcf = 1, max = Math.max(numOne, numTwo);
            for (int val = 1; val < max; val++) {
                hcf = ((numOne % val) == 0 && (numTwo % val) == 0) ? val : hcf;
            }
            long lcm = (numOne * numTwo) / hcf;
            System.out.println("The LCM of " + numOne + " and " + numTwo + " = " + lcm);
        }

    }
}
