package Intermediate;

import java.util.Scanner;

// 15. Find Ncr & Npr
public class Ncr_Npr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter C for nCr or P for nPr: ");
        char operation = input.next().charAt(0);
        System.out.print("Enter a Number: ");
        long num = input.nextLong();
        System.out.print("Enter second r Number: ");
        long r_num = input.nextLong();
        double ncr, npr;
        if (operation == 'C' || operation == 'c') {
            ncr =(float) factorial(num) / (factorial(r_num) * factorial(num - r_num));
            System.out.println("The value of " + num +"C"+ r_num + " = " + ncr);
        }
        if (operation == 'P' || operation == 'p') {
            npr = (float)factorial(num) / factorial(num - r_num);
            System.out.print("The value of " + num +"P"+ r_num +" = " + npr);
        }
    }
   private static long factorial(long num){
        return num == 0 ? 1: (num * factorial(num - 1));
    }
}
