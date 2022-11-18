 package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _18_AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;
        List<Integer> arr = addToArrayForm(num, k);
        System.out.println(arr);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        List<Integer> list = new ArrayList<>(5);
        int current = k;

        int index = len;
        while (--index >= 0 || current > 0) {
            if (index >= 0)
                current += num[index];
            list.add(current % 10);
            current /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
