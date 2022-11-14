package easy;

import java.util.Arrays;

public class _15_CheckIfNAndItsDoubleExist {
  public static void main(String[] args) {
    final int[] arr = { 3, 1, 7, 11 };
    boolean exist = checkIfExist(arr);
    System.out.println(exist);
  }

  private static boolean checkIfExist(int[] arr) {
    Arrays.sort(arr);
    for (int index = 0; index < arr.length; index++) {
      int target = 2 * arr[index];
      int start = 0, end = arr.length - 1;
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target && mid != index) {
          return true;
        } else if (arr[mid] < target) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return false;
  }
}