package hard;

import java.util.Arrays;
import java.util.Scanner;
// https://www.spoj.com/problems/AGGRCOW/
public class _03_AggressiveCows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        for (int cases = 0; cases < test; cases++) {
            int total = input.nextInt();
            int distance = input.nextInt();
            int[] array = new int[total];
            for (int index = 0; index < total; index++) {
                array[index] = input.nextInt();
            }
            int result = binarySearch(array, distance);
            System.out.println(result);
        }
    }

    private static int binarySearch(int[] array, int distance) {
        int start = 0;
        int end = array.length - 1;
        int res = -1;
        Arrays.sort(array);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(array, mid, distance)) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    private static boolean isPossible(int[] array, int mid, int distance) {
        int cows = 1;  // we already place it at the first available slot i.e array[0]  ( GREEDY )
        int lastCowPosition = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] - lastCowPosition >= mid) {
                cows++;
                lastCowPosition = array[index];
                if (cows >= distance){ return true;}
            }
        }
        return false;
    }
}
