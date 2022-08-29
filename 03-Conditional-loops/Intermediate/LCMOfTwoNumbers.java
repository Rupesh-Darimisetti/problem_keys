package Intermediate;

import  java.util.Scanner;
// 20. LCM Of Two Numbers
public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two values to find LCM");
        System.out.print("Enter First Number: ");
        long num_one = input.nextLong();
        System.out.print("Enter Second Number: ");
        long num_two = input.nextLong();
        long hcf = 1, max =  Math.max(num_one,num_two);
        for (int val = 1; val < max; val++) {
            hcf = ((num_one % val) == 0 && (num_two % val) == 0) ? val : hcf;
        }
        long lcm = (long)(num_one * num_two) / hcf;
        System.out.println("The LCM of " + num_one + " and " + num_two + " = " + lcm);

    }
}
