package intermediate;

import java.util.Scanner;

// 14. Armstrong Number In Java
public class _14_ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to check it is Armstrong or not: ");
            long realNum = input.nextLong();
            long rem, sum = 0, num = realNum;
            while (num > 0) {
                rem = num % 10;
                sum += Math.pow(rem, 3);
                num /= 10;
            }
            if (sum == realNum) {
                System.out.println("The Given Number is an Armstrong Number");
            } else {
                System.out.println("The Given Number is not an Armstrong Number");
            }
        }
    }
}
