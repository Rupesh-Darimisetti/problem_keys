package hard;

interface MountainArray{
    int[] array= {};
    static int get(int index){
       return -1;
    }

    static int length(){
        return -1;
    }
}

public class _06_FindInMountainArray {
    public static void main(String[] args) {
        int[] mountainArray = new int[]{1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int result = findInMountainArray(target, mountainArray);
        System.out.println(result);
    }
    private static int findInMountainArray(int target, int[] mountainArr) {
        int n = array.length(mountainArr);
        int l = 0;
        int r = n - 1;
        int peek = -1;
        int peekN = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid == 0) {
                l = 1;
                continue;
            } else if (mid == n - 1) {
                r = n - 2;
                continue;
            }
            int mN = array.get(mountainArr,mid);
            int pN = array.get(mountainArr,mid-1);
            int bN = array.get(mountainArr,mid+1);
            if (mN > pN && mN > bN) {
                peek = mid;
                peekN = mN;
                break;
            } else if (mN > pN) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (target > peekN) return -1;
        if (target == peekN) return peek;
        int res = binarySearch(0, peek - 1, 1, target, mountainArr);
        if (res != -1) return res;
        return binarySearch(peek + 1, n - 1, -1, target, mountainArr);
    }

    private static int binarySearch(int l, int r, int direction, int target, int[] mountainArr) {
        while (l <= r) {
            int mid = (l + r) / 2;
            int mN = array.get(mountainArr,mid);
            if (target == mN) {
                return mid;
            } else if (direction * target < direction * mN) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}

class array implements MountainArray{
   public static int get(int[] array ,int index){
        return (index >0 && index < array.length -1) ?array[index] : -1;
    }
    public static int length(int[]array){
        int count = 0;
        if(array != null) {
            for (int i = 0; i < array.length; i++) {
                count++;
            }
        }
        return count;
    }
}
