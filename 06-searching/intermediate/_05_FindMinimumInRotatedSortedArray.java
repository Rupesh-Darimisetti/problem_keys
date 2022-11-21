package intermediate;

public class _05_FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] numberArray = {4,5,6,7,0,1,2};
        int minimum = findMin(numberArray);
        System.out.println(minimum);
    }
    private  static int findMin(int[] numberArray) {
        int left = 0;
        int right = numberArray.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(numberArray[mid] < numberArray[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return numberArray[right];
    }
}
