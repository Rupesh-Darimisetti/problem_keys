package org.rupesh.easy;

import java.util.Arrays;

public class _25_CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[]arr= {3,5,1};
boolean canMakeArithmeticProgression = canMakeArithmeticProgression(arr);
        System.out.println(canMakeArithmeticProgression);
    }
        public static boolean canMakeArithmeticProgression(int[] arr) {
            int len =  arr.length;
            if(len < 3)return true;
            Arrays.sort(arr);
            int diff = arr[1]-arr[0];
            for(int pos = 1; pos < len; pos++){
                if(arr[pos] - arr[pos - 1] != diff){
                    return false;
                }
            }
            return true;
        }
}
