package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;

// 12. Calculate Average Marks
public class _12_AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total subjects: ");
        int n_subj = input.nextInt();
        long total = 0;
        double average;
        total = getTotal(input, n_subj, total);
        average = (float) total / n_subj;
        System.out.println("The average of " + n_subj + " subjects = " + average);
    }

    private static long getTotal(Scanner input, int n_subj, long total) {
        long marks;
        for (int subj = 1; subj <= n_subj; subj++) {
            System.out.print("Enter Marks of Subject " + subj + " : ");
            marks = input.nextInt();
            while (marks > 100 || marks < 0) {
                System.out.print("Enter Marks of Subject " + subj + " above 100 or below 0: ");
                marks = input.nextInt();
            }
            total += marks;
        }
        return total;
    }
}
