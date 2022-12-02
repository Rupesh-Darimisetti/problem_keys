package intermediate;

//import java.util.Arrays;

/**
 * Given an array of integers numberArray containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in numberArray, return this repeated number. You must solve the problem without
 * modifying the array numberArray and uses only constant extra space.
 */
public class _15_FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] numberArray = {3, 1, 3, 4, 2};
        int duplicateNumber = findDuplicate(numberArray);
        System.out.println(duplicateNumber);
    }

    private static int findDuplicate(int[] numberArray) {
        boolean[] visit = new boolean[numberArray.length];
        for (int value : numberArray) {
            if (visit[value]) {
                return value;
            }
            visit[value] = true;
        }
        return -1;
    }
    //        Arrays.sort(numberArray);
//        int start = 0, end = numberArray.length -1;
//        while(start < end){
//            int mid = start + (end -start) / 2;
//            if(numberArray[mid] >= mid + 1) {
//                start = mid+1;
//            } else {
//                end = mid-1;
//            }
//        }
//        return numberArray[start];
}
