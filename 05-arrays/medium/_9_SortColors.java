package medium;

import java.util.Arrays;

public class _9_SortColors {
    public static void main(String[] args) {
        int[] numbersArray = {2, 0, 2, 1, 1, 0};
        sortColors(numbersArray);
    }

    public static void sortColors(int[] numbersArray) {
        int begin = 0;
        int end = numbersArray.length - 1;

        while (begin < end) {
            if (numbersArray[begin] == 0) begin++;
            if (numbersArray[end] != 0) end--;
            if (numbersArray[begin] != 0 && numbersArray[end] == 0 && begin < end) {
                int num = numbersArray[begin];
                numbersArray[begin] = numbersArray[end];
                numbersArray[end] = num;
                begin++;
                end--;
            }
        }

        end = numbersArray.length - 1;

        if (numbersArray[begin] == 0) begin++;

        while (begin < end) {
            if (numbersArray[begin] == 1) begin++;
            if (numbersArray[end] > 1) end--;
            if (numbersArray[begin] > 1 && numbersArray[end] == 1 && begin < end) {
                int num = numbersArray[begin];
                numbersArray[begin] = numbersArray[end];
                numbersArray[end] = num;
                begin++;
                end--;
            }
        }
        System.out.println(Arrays.toString(numbersArray));
    }
}
