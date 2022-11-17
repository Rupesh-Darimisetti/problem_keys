package intermediate;

import java.util.Scanner;

// 12. Calculate Average Marks
public class _12_AverageMarks {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter total subjects: ");
            int totalSubjects = input.nextInt();
            long total = 0, marks;
            double average;
            for (int subj = 1; subj <= totalSubjects; subj++) {
                System.out.print("Enter Marks of Subject " + subj + " : ");
                marks = input.nextInt();
                while (marks > 100) {
                    System.out.println("Enter Marks of Subject " + subj + " below or equal to 100: ");
                    marks = input.nextInt();
                }
                total += marks;
            }
            average = (float) total / totalSubjects;
            System.out.println("The average of " + totalSubjects + " subjects = " + average);
        }
    }
}
