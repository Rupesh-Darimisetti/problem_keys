package intermediate;

import java.util.Scanner;

// 8. Calculate Depreciation of Value
public class _08_DepreciationOfValue {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter amount of money: ");
            long amount = input.nextLong();
            System.out.print("Enter Depreciation percentage: ");
            long depreciation = input.nextLong();
            System.out.print("Enter Number of years the thing is depreciated: ");
            long noOfYears = input.nextLong();
            long depreciationValue = amount;
            for (int time = 0; time < noOfYears; time++) {
                depreciationValue = ((100 - depreciation) * depreciationValue) / 100;
            }
            System.out.print("The Depreciation value: " + depreciationValue);
        }
    }
}
