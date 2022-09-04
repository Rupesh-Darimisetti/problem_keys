package assignment123Functions.firstJava;// 5. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestOfTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long firstNo, secondNo, longNum = 0L;
        System.out.print("Enter first number: ");
        firstNo = input.nextLong();
        System.out.print("Enter second number: ");
        secondNo = input.nextLong();
        longNum = getLongNum(firstNo, secondNo, longNum);
        if (longNum == 0){
            System.out.println("Both numbers are same and it is " + firstNo);
        }else {
            System.out.println("The largest of two numbers is " + longNum);
        }
}

    private static long getLongNum(long firstNo, long secondNo, long longNum) {
        if ((firstNo > secondNo)) {
            return firstNo;
        } else {
            if (secondNo > firstNo) return secondNo;
            return 0L;
        }
    }
}