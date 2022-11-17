package easy;

import java.util.Arrays;
import java.util.HashSet;

class _12_IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int[] numbers1 = {4, 9, 5}, numbers2 = {9, 4, 9, 8, 4};
        int[] intersection = intersection(numbers1, numbers2);
        System.out.println(Arrays.toString(intersection));
    }

    private static int[] intersection(int[] numbers1, int[] numbers2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int value : numbers1) {
            set.add(value);
        }

        for (int num : numbers2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }

        int[] arr = new int[res.size()];
        int jtr = 0;
        for (int itr : res) {
            arr[jtr++] = itr;
        }
        return arr;
    }
}