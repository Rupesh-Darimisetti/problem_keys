package easy;

import java.util.Arrays;

public class _12_FindTheHighestAltitude {
    public static void main(String[] args) {
//        int[] gain = {-5,1,5,0,-7};
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int largeAlt = largestAltitude(gain);
        System.out.println("The Largest Altitude =\t" + largeAlt);
    }
    private static int largestAltitude(int[] gain) {
        int len = gain.length;
        int[] number = new int[len + 1];
        number[0] = 0;
        int largeAlt = 0;
        int sum = 0;
        for(int val = 0; val <len; val++){
            sum = sum + gain[val];
            number[val] = sum;
        }
        for (int val:number) {
            if (val > largeAlt){
                largeAlt = val;
            }
        }
        return largeAlt;
    }
}
