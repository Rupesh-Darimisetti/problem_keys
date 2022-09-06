package assignment123Functions.conditionalLoops.intermediate;

import java.util.Scanner;
// 10. Calculate CGPA Java Program
public class CGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total subjects: ");
        int subj = input.nextInt();
        System.out.println("""
                grade\tmarks
                O\t\t10
                S\t\t9
                A\t\t8
                B\t\t7
                C\t\t6
                D\t\t5
                F or ABSENT \t0""");
        System.out.println("Enter subjects marks and credits indivdually as per above grades and marks: ");
        double total = 0, total_credits = 0;
        double cgpa = cgpaCalculator(input, subj, total, total_credits);
        System.out.println("The CGPA of " + subj + " = " + cgpa);
    }
    private static double cgpaCalculator(Scanner input, int subj, double total, double total_credits) {
        for (int subj_count = 1; subj_count <= subj; subj_count++) {
                System.out.print("Enter marks of subject " + subj_count + ": ");
                String marks = input.next().toLowerCase();
                System.out.print("Enter credits of subject " + subj_count + ": ");
                float credits = input.nextFloat();
                total_credits += credits;
                if(marks.charAt(0) == 'o')    total += 10L * credits;
                if(marks.charAt(0) == 's')    total += 9L * credits;
                if(marks.charAt(0) == 'a')    total += 8L * credits;
                if(marks.charAt(0) == 'b')    total += 7L * credits;
                if(marks.charAt(0) == 'c')    total += 6L * credits;
                if(marks.charAt(0)  == 'd')    total += 5L * credits;
                if((marks.charAt(0) == 'f') || marks.equals("absent")) total += credits * 0L;
        }
        return total / total_credits;
    }
}
