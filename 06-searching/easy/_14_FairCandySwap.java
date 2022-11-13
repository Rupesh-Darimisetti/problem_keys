package easy;

import java.util.Arrays;

class _14_FairCandySwap{
    public static void main(String[] args) {
        int[] aliceSizes = {1,2}, bobSizes = {2,3};
        int[] ans = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(ans));
    }

   private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int suma = 0, sumb =0;
        for(int i = 0; i < aliceSizes.length; i++) suma += aliceSizes[i];
        for(int i = 0; i < bobSizes.length; i++) sumb += bobSizes[i];

        int diff = (suma - sumb) / 2;
        Arrays.sort(aliceSizes);
        for(int num : bobSizes){
            if(binarySearch(aliceSizes, num + diff) != -1){
                return new int[]{num + diff, num};
            }
        }

        return null;
    }
    private static int binarySearch(int[] arr, int target){
        int start = 0, end =arr.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start = mid + 1;
            else end = mid -1;
        }
        return -1;
    }
}