package easy;

public class _06_ArrangingCoins {
    public static void main(String[] args) {
        int number = 1000453986;
        int coinsArranged = arrangeCoins(number);
        System.out.println(coinsArranged);
    }
    private static int arrangeCoins(int n) {
        long start = 1, end = n, res = 0;

        while(start <= end){
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;

            if(sum > n){
                end = mid -1;
            } else if(sum < n){
                res = mid;
                start = mid + 1;
            } else return (int)mid;
        }
        return (int)res;
    }
}
