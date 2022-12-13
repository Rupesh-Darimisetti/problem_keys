package assignment123Functions.firstJava;

// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class _05_LargestOfTwoNum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            long firstNo, secondNo, longNum;
            System.out.print("Enter first number: ");
            firstNo = input.nextLong();
            System.out.print("Enter second number: ");
            secondNo = input.nextLong();
            longNum = getLongNum(firstNo, secondNo);
            if (longNum == 0) {
                System.out.println("Both numbers are same and it is " + firstNo);
            } else {
                System.out.println("The largest of two numbers is " + longNum);
            }
        }
    }

    private static long getLongNum(long firstNo, long secondNo) {
        if ((firstNo > secondNo)) {
            return firstNo;
        } else {
            if (secondNo > firstNo) return secondNo;
            return 0L;
        }
    }
}