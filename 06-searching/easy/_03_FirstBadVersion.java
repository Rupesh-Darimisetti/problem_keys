package easy;

public class _03_FirstBadVersion {
    static int bad;
    public static void main(String[] args) {
        //bad = 4;
        int n = 2126753390;
        bad = 1702766719;
        int version = firstBadVersion(n);
        System.out.println(version);
    }
    private static int firstBadVersion(int n) {
        int low = 1;
        int high = n,ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isBadVersion(mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid  + 1;
            }
        }
        return ans;
    }

    private static boolean isBadVersion(int mid) {
        return mid >= bad;
    }
}
