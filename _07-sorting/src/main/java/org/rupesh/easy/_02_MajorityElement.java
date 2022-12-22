package org.rupesh.easy;

public class _02_MajorityElement {
    public static void main(String[] args) {
        int[] numberArray = {2, 2, 1, 1, 1, 2, 2};
        int majorElement = majorityElement(numberArray);
        System.out.println(majorElement);
    }

    public static int majorityElement(int[] numberArray) {
        int count = 0, majorityElement = 0;
        for (int num : numberArray) {
            if (count == 0) majorityElement = num;
            if (majorityElement == num) count++;
            else count--;
        }
        return majorityElement;
    }
}
