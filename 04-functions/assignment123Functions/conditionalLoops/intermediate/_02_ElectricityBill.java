package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 2. Calculate Electricity Bill

/**
 * Scheme	Tariff Range	Per unit(₹)	Max unit A 0-50	1.45	75 51-75	2.6	75 B 0-50	2.6	225 51-100	2.6	225 101-200	3.6	225
 * 201-225	6.9	225 scheme C traffic range, per unit, max unit 0-50	2.65	>225 51-100	3.35	>225 101-200	5.4	>225
 * 201-300	7.1	>225 301-400	7.95	>225 401-500	8.5	>225 >500	9.95	>225
 */
public class _02_ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Enter Scheme type like\s
                 \tA if max unit is 75
                \tB if max unit is 225
                \tC if max unit is greater than 225:\s""");
        char scheme_type = input.next().charAt(0);
        System.out.print("Enter units of Electric Bill: ");
        int units = input.nextInt();
        double total = electricityBill(scheme_type, units);
        System.out.print("The Current total current bill for " + units + " units = " + total);
    }

    private static double electricityBill(char scheme_type, int units) {
        double total = 0;
        if (scheme_type == 'A' || scheme_type == 'a') {
            if (units <= 50) {
                total = units * 1.45;
            }
            if (units <= 75) {
                total = (50 * 1.45) + (units - 50) * 2.6;
            }
        } else if (scheme_type == 'B' || scheme_type == 'b') {
            if (units <= 50) {
                total = units * 2.6;
            } else if (units <= 100) {
                total = units * 2.6;
            } else if (units <= 200) {
                total = (100 * 2.6) + (units - 100) * 3.6;
            } else if (units <= 225) {
                total = (100 * 2.6) + (100 * 3.6) + (units - 200) * 6.9;
            }
        } else if (scheme_type == 'C' || scheme_type == 'c') {

            if (units <= 50) {
                total = units * 2.65;
            } else if (units <= 100) {
                total = (50 * 2.65) + (units - 50) * 3.35;
            } else if (units <= 200) {
                total = (50 * 2.65) + (50 * 3.35) + (units - 100) * 5.4;
            } else if (units <= 300) {
                total = (50 * 2.65) + (50 * 3.35) + (100 * 5.4) + (units - 200) * 7.1;
            } else if (units <= 400) {
                total = (50 * 2.65) + (50 * 3.35) + (100 * 5.4) + (100 * 7.1) + (units - 300) * 7.95;
            } else {
                if (units <= 500) {
                    total = (50 * 2.65) + (50 * 3.35) + (100 * 5.4) + (100 * 7.1) + (100 * 7.95) + (units - 400) * 8.5;
                }
                if (units > 500) {
                    total = (50 * 2.65) + (50 * 3.35) + (100 * 5.4) + (100 * 7.1) + (100 * 7.95) + (100 * 8.5) +
                            (units - 500) * 9.95;
                }
            }
        }
        return total;
    }
}
