package intermediate;

import java.util.Scanner;

//  19. HCF Of Two Numbers Program
public class _19_HCFOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Two values to find HCF");
            System.out.print("Enter First Number: ");
            long num_one = input.nextLong();
            System.out.print("Enter Second Number: ");
            long num_two = input.nextLong();
            long hcf = 1, max = Math.max(num_one, num_two);
            for (int val = 1; val < max; val++) {
                hcf = ((num_one % val) == 0 && (num_two % val) == 0) ? val : hcf;
            }
            System.out.println("The HCF of " + num_one + " and " + num_two + " = " + hcf);
        }

    }
}
