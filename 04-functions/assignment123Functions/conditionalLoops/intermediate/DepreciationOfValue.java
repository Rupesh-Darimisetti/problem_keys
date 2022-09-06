package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 8. Calculate Depreciation of Value
public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of Money: ");
        long amount = input.nextLong();
        System.out.print("Enter Depreciation percentage: ");
        long depreciation = input.nextLong();
        System.out.print("Enter Number of years the thing is depriciated: ");
        long no_of_years = input.nextLong();
        long dep_val = depreciationValue(amount, depreciation, no_of_years);
        System.out.print("The Depreciation value: " + dep_val);
    }
    private static long depreciationValue(long amount, long depreciation, long no_of_years) {
        long dep_val = amount;
        for (int time = 0; time < no_of_years; time++) {
            dep_val = ((100 - depreciation) * dep_val) / 100;
        }
        return dep_val;
    }
}
