package intermediate;

import java.util.Scanner;

// 6. Calculate Commission Percentage
public class _06_CommissionPercentage {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Sales Price: ");
            double salesPrice = input.nextDouble();
            System.out.print("Enter Commission: ");
            double commission = input.nextDouble();
            double commissionRate = (commission / salesPrice) * 100;
            System.out.println("The Commission rate he/she got = " + commissionRate + "%");
        }
    }
}
