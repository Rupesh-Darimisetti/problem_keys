package org.rupesh.easy;

public class _08_AssignCookies {
    public static void main(String[] args) {
        int[] greedy = {1, 2, 3}, childCookie = {1, 1};
        int res = findContentChildren(greedy, childCookie);
        System.out.println(res);
    }

    public static int findContentChildren(int[] greedy, int[] childCookie) {
        sort(greedy);
        sort(childCookie);

        int i = 0, j = 0;
        while (i != greedy.length && j != childCookie.length) {
            if (greedy[i] <= childCookie[j]) {
                i++;
            }
            j++;
        }
        return i;
    }

    public static void sort(int[] arr) {
        // insertion sort
        for (int noOfPasses = 0; noOfPasses < arr.length - 1; noOfPasses++) {
            for (int val = noOfPasses + 1; val > 0; val--) {
                if (arr[val] < arr[val - 1]) {
                    swap(arr, val, val - 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int oldPos, int newPos) {
        int temp = arr[oldPos];
        arr[oldPos] = arr[newPos];
        arr[newPos] = temp;
    }
}
