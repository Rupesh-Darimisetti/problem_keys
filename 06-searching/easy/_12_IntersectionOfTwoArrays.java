package easy;

import java.util.HashSet;
import java.util.Arrays;

class _12_IntersectionOfTwoArrays{
    public static void main(String[] args, int[] is) {

        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] intersection = intersection(nums1, nums2);
        System.out.println(Arrays.toString(intersection));
    }
    private  static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet();
        HashSet<Integer> res = new HashSet();

        for(int itr = 0; itr < nums1.length; itr++){
            set.add(nums1[itr]);
        }

        for(int itr = 0; itr < nums2.length; itr++){
            if(set.contains(nums2[itr])){
                res.add(nums2[itr]);
            }
        }

        int[] arr = new int[res.size()];
        int jtr = 0;
        for (int itr : res) {
            arr[jtr++] = itr;
        }
        return arr;
    }
}