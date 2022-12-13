package assignment123Functions.flowOfProgram;

import java.util.Scanner;

// 4. Take 2 numbers as inputs and find their HCF and LCM.
public class _04_HCFAndLCM {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int first_num = input.nextInt();
            System.out.print("Enter Second Number: ");
            int second_num = input.nextInt();
            long hcf = hcf(first_num, second_num);
            System.out.println("The HCF of " + first_num + " and " + second_num + " =  " + hcf);
            long lcm = lcm(first_num, second_num);
            System.out.println("The LCM of " + first_num + " and " + second_num + " =  " + lcm);
        }
    }

    private static long lcm(int first_num, int second_num) {
        return (long) first_num * second_num / hcf(first_num, second_num);
    }

    private static long hcf(int num_one, int num_two) {
        long hcf = 1, max = Math.max(num_one, num_two);
        for (int val = 1; val < max; val++) {
            hcf = ((num_one % val) == 0 && (num_two % val) == 0) ? val : hcf;
        }
        return hcf;
    }
}
