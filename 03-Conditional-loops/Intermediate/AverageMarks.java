package Intermediate;

import java.util.Scanner;

// 12. Calculate Average Marks
public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total subjects: ");
        int n_subj = input.nextInt();
        long total = 0, marks;
        double average;
        for (int subj = 1; subj <= n_subj ; subj++) {
            System.out.print("Enter Marks of Subject " + subj + " : ");
            marks = input.nextInt();
            while(marks > 100){
                System.out.println("Enter Marks of Subject " + subj + " below or equal to 100: ");
                marks = input.nextInt();
            }
            total += marks;
        }
        average = (float)total / n_subj;
        System.out.println("The average of " + n_subj + " subjects = " + average);
    }
}
