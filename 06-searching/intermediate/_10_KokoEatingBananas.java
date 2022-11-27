package intermediate;

/**
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and
 * will come back in h hours. Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile
 * of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and
 * will not eat any more bananas during this hour. Koko likes to eat slowly but still wants to finish eating all the
 * bananas before the guards return. Return the minimum integer k such that she can eat all the bananas within h hours.
 */
public class _10_KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int hours = 5;
        int minSpeed = minEatingSpeed(piles, hours);
        System.out.println(minSpeed);
    }

    private static int minEatingSpeed(int[] piles, int hours) {
        int left = 1, right = 1000000000;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int total = 0;
            for (int value : piles) {
                total += (value + mid - 1) / mid;
            }
            if (total > hours) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
