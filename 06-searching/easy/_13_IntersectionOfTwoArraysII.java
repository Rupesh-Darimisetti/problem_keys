package easy;

import java.util.ArrayList;
import java.util.Arrays;

class _13_IntersectionOfTwoArraysII {
    public static void main(String[] args) {

        int[] numbers1 = {4, 9, 5}, numbers2 = {9, 4, 9, 8, 4}; // Output: [4,9]

        int[] intersection = intersect(numbers1, numbers2);
        System.out.println(Arrays.toString(intersection));
    }

    private static int[] intersect(int[] numbers1, int[] numbers2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(numbers1);
        Arrays.sort(numbers2);
        int i = 0, j = 0;
        while (i < numbers1.length && j < numbers2.length) {
            if (numbers1[i] < numbers2[j])
                i++;
            else if (numbers1[i] > numbers2[j])
                j++;
            else {
                list.add(numbers1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[list.size()];
        int index = 0;
        for (int ele : list) {
            ans[index++] = ele;
        }
        return ans;
    }
}