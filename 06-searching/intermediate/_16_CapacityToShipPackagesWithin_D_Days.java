package intermediate;

public class _16_CapacityToShipPackagesWithin_D_Days {
    public static void main(String[] args) {

        int[] weights={1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int deliveryTime = shipWithinDays(weights, days);
        System.out.println(deliveryTime);
    }
    private static int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int heaviestItem = weights[0];
        for (int weight : weights) {
            heaviestItem = Math.max(heaviestItem, weight);
            sum += weight;
        }

        int avgWeightOnShip =  sum / days;
        // Minimum required weight capacity of a ship
        int minWeight = Math.max(heaviestItem, avgWeightOnShip);

        // Start from minimum possible size to maximum possible
        for (int i = minWeight, len = weights.length; i <= len * minWeight; i++) {
            int[] ship = new int[days];
            int index = 0;
            // Fill all the ships
            for (int j = 0; j < ship.length; j++) {
                // Try to fit as many items as possible
                while (index < len && ship[j] + weights[index] < i) {
                    ship[j] += weights[index];
                    index++;
                }
            }
            if (index == len)
                return i - 1;
        }
        return 0;
    }
}
