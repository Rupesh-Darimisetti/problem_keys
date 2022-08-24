package Intermediate;

import java.util.Scanner;

// 8. Calculate Depreciation of Value
public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of moey: ");
        long amount = input.nextLong();
        System.out.print("Enter Depriciation percentage: ");
        long depriciation = input.nextLong();
        System.out.print("Enter Number of years the thing is depriciated: ");
        long no_of_years = input.nextLong();
        long dep_val = amount;
        for (int time = 0; time < no_of_years; time++) {
            dep_val = ((100 - depriciation) * dep_val) / 100;
        }
        System.out.print("The Depriciation value: " + dep_val);
    }
}
