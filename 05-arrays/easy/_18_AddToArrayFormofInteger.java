package easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.lang.String.valueOf;

public class _18_AddToArrayFormofInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k= 1;
        //        int[] num = {2,7,4};
//        int k = 181;
        List<Integer> arr = addToArrayForm(num, k);
        System.out.println(arr);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        List<Integer> list = new ArrayList<>(5);
        int currr = k;

        int index = len;
        while (--index >= 0 || currr > 0){
            if (index >= 0)
                currr += num[index];
            list.add(currr % 10);
            currr /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
