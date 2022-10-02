package medium;

import java.util.Arrays;

public class _6_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] res = searchRange(nums, target);
        System.out.println(Arrays.toString(res));
    }
    private static int[] searchRange(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int[] arr = new int[2];
        arr[0] = firstIndex(first, last, nums, target);
        arr[1] = lastIndex(first, last, nums, target);
        return arr;
    }
    private static int firstIndex(int first, int last, int[] nums, int target){
        int ans = -1;
        while(first <= last){
            int mid = first + (last - first) /2;
            if(nums[mid] == target){
                ans = mid;
                last = mid -1;
            } else if(nums[mid] > target){
                last = mid - 1;
            } else{
                first = mid + 1;
            }
        }
        return ans;
    }

    private static int lastIndex(int first, int last, int[] nums, int target){
        int ans = -1;
        while(first <= last){
            int mid = first + (last - first) / 2;
            if(nums[mid]==target){
                ans = mid;
                first = mid+1;
            }else if(nums[mid]>target){
                last = mid-1;
            }else{
                first = mid+1;
            }
        }
        return ans;
    }
}
