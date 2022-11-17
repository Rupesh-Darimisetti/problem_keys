package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

//  19. HCF Of Two Numbers Program
public class _19_HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two values to find HCF");
        System.out.print("Enter First Number: ");
        long num_one = input.nextLong();
        System.out.print("Enter Second Number: ");
        long num_two = input.nextLong();
        long hcf = HCF(num_one, num_two);
        System.out.println("The HCF of " + num_one + " and " + num_two + " = " + hcf);
    }

    private static long HCF(long num_one, long num_two) {
        long hcf = 1, max = Math.max(num_one, num_two);
        for (int val = 1; val < max; val++) {
            hcf = ((num_one % val) == 0 && (num_two % val) == 0) ? val : hcf;
        }
        return hcf;
    }
}
