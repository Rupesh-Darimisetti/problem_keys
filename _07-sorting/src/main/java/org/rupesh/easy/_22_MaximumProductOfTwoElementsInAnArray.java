package org.rupesh.easy;

public class _22_MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int[] numberArray = {3, 4, 5, 2};
        int maxProduct = maxProduct(numberArray);
        System.out.println(maxProduct);
    }

    public static int maxProduct(int[] numberArray) {
        /*
          Given the array of integers numberArray, you will choose two different indices i and j of that array.
          Return the maximum value of (numberArray[i]-1)*(numberArray[j]-1).
         */
        int winner = Integer.MIN_VALUE;
        int runner = Integer.MIN_VALUE;
        for (int num : numberArray) {
            if (num > winner) { // it stores first largest number
                runner = winner;
                winner = num;
            } else if (num > runner) {// it stores second-largest number
                runner = num;
            }
        }
        return (winner - 1) * (runner - 1);
    }
}
