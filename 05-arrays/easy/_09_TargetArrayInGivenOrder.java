package easy;

import java.util.ArrayList;
import java.util.Arrays;

// 9. Create Target Array in the Given Order
public class _09_TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] numberArray = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] createTargetArray = createTargetArray(numberArray, index);
        System.out.println(Arrays.toString(createTargetArray));
    }

    public static int[] createTargetArray(int[] numberArray, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = numberArray.length;
        for (int val = 0; val < len; val++) {
            list.add(index[val], numberArray[val]);
        }
        int[] arr = new int[len];
        for (int val = 0; val < len; val++) {
            arr[val] = list.get(val);
        }
        return arr;
    }
}
