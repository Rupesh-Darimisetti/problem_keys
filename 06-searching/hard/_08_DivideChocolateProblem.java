package hard;

// https://curiouschild.github.io/leetcode/2019/06/21/divide-chocolate.html
public class _08_DivideChocolateProblem {

  public static void main(String[] args) {
    int[] sweetness = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int k = 5;
    int result = maximizeSweetness(sweetness, k);
    System.out.println("result = " + result);
  }

  public static int maximizeSweetness(int[] numberArray, int m) {
    m++;
    long min_value = Integer.MAX_VALUE, right = 0;
    for (int num : numberArray) {
      right += num;
      min_value = Math.min(min_value, num);
    }
    while (min_value + 1 < right) {
      long mid = min_value + (right - min_value) / 2;
      if (canSplit(numberArray, m, mid)) {
        min_value = mid;
      } else {
        right = mid - 1;
      }
    }
    return (canSplit(numberArray, m, right)) ? (int) right : (int) min_value;
  }

  public static boolean canSplit(int[] nums, int m, long target) {
    long sum = 0, count = 0;
    for (int num : nums) {
      if (sum + num >= target) {
        sum = 0;
        count++;
      } else {
        sum += num;
      }
    }
    return count >= m;
  }
}
