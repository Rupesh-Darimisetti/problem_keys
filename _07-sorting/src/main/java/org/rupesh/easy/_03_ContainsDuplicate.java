package org.rupesh.easy;

import java.util.HashSet;

public class _03_ContainsDuplicate {
    public static void main(String[] args) {
        int[] numberArray = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = containsDuplicate(numberArray);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] numberArray) {
        HashSet<Integer> ele = new HashSet<>();
        for (int num : numberArray) {
            ele.add(num);
        }
        return ele.size() != numberArray.length;
    }

}
