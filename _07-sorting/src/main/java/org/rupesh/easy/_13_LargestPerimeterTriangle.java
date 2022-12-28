package org.rupesh.easy;

// https://leetcode.com/problems/largest-perimeter-triangle/submissions/866978116/
public class _13_LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] numberArray = {3, 2, 3, 4}; // 10
        int perimeter = largestPerimeter(numberArray);
        System.out.println(perimeter);
    }

    public static int largestPerimeter(int[] numberArray) {
        insertionSortingAlgorithm(numberArray);
        int len = numberArray.length;
        for (int side = len - 1; side > 1; side--) {
            if (numberArray[side] < (numberArray[side - 1] + numberArray[side - 2])) {
                return numberArray[side] + numberArray[side - 1] + numberArray[side - 2];
            }
        }
        return 0;
    }

    public static void insertionSortingAlgorithm(int[] numberArray) {
        int len = numberArray.length - 1;
        // Insertion sort algorithm
        for (int noOfPasses = 0; noOfPasses < len; noOfPasses++) {
            for (int oldIndex = noOfPasses + 1; oldIndex > 0; oldIndex--) {
                if (numberArray[oldIndex] < numberArray[oldIndex - 1]) {
                    // Compare adjacent values and swap if less than the next one
                    swap(numberArray, oldIndex, oldIndex - 1);
                } else {
                    // As the element with higher values at the end of array.
                    break;
                }
            }
        }
    }

    public static void swap(int[] numberArray, int oldIndex, int newIndex) {
        int bufferStorage = numberArray[oldIndex];
        numberArray[oldIndex] = numberArray[newIndex];
        numberArray[newIndex] = bufferStorage;
    }
}
