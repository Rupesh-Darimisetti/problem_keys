// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class _5_LargestOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long firstNo, secondNo, longNum = 0L;
        System.out.print("Enter first number: ");
        firstNo = input.nextLong();

        System.out.print("Enter second number: ");
        secondNo = input.nextLong();

        if (firstNo > secondNo) {
            longNum = firstNo;
        } else if (secondNo > firstNo) {
            longNum = secondNo;
        } else {
            System.out.println("Both numbers are same");
        }

        System.out.println("The largest of two numbers is " + longNum);
    }
}