package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;
// 14. Armstrong Number In Java
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check it is Amgstrong or not: ");
        long real_num = input.nextLong();
        long rem, sum = 0, num = real_num;
        sum = armstrongNo(sum, num);
        if(sum == real_num){
            System.out.println("The Given Number is an Armstrong Number");
        }else {
            System.out.println("The Given Number is not an Armstrong Number");
        }
    }
    private static long armstrongNo(long sum, long num) {
        long rem;
        while(num > 0){
            rem = num % 10;
            sum += Math.pow(rem, 3);
            num /= 10;
        }
        return sum;
    }
}
