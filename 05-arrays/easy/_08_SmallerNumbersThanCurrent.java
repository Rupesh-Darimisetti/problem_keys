package easy;

import java.util.Arrays;

// 8. How Many Numbers Are Smaller Than the Current Number
public class _08_SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        System.out.println("Program to print How Many Numbers Are Smaller Than the Current Number");
        int[] numberArray = {6, 5, 4, 8};
        int[] smallerNumbersArray = smallerNumbersThanCurrent(numberArray);
        System.out.println(Arrays.toString(numberArray) + "\t==>\t" + Arrays.toString(smallerNumbersArray));
        int[] numberArray1 = {8, 1, 2, 2, 3};
        smallerNumbersArray = smallerNumbersThanCurrent(numberArray1);
        System.out.println(Arrays.toString(numberArray1) + "\t==>\t" + Arrays.toString(smallerNumbersArray));
    }

    public static int[] smallerNumbersThanCurrent(int[] numberArray) {
        int len = numberArray.length;
        int[] arr = new int[len];
        int count, min;
        for (int val = 0; val < len; val++) {
            min = numberArray[val];
            count = 0;
            for (int num : numberArray) if (min > num) count++;
            arr[val] = count;
        }
        return arr;
    }
}
