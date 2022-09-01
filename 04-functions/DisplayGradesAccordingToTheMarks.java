import java.util.Scanner;
/** 8. Write a program that will ask the user to enter his/her marks (out of 100).
 * Define a method that will display grades according to the marks entered as below:
 * Marks        Grade
 * 91-100         AA
 * 81-90          AB
 * 71-80          BB
 * 61-70          BC
 * 51-60          CD
 * 41-50          DD
 * <=40          Fail
 */
public class DisplayGradesAccordingToTheMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks to Know Grades: ");
        int marks = input.nextInt();
        String grade = grade(marks);
        System.out.println("The Grade for " + marks + " marks = " + grade);
    }
    private static String grade(int marks){
        String grade = "Marks cannot be greater than 100 or less than 0";
        if (marks <= 100 && marks > 90) {
            grade = "AA";
        }
        if (marks >= 81 && marks < 91) {
            grade = "AB";
        }
        if (marks >= 71 && marks < 81) {
            grade = "BB";
        }
        if (marks >= 61 && marks < 71) {
            grade = "BC";
        }
        if (marks >= 51 && marks < 61) {
            grade = "CD";
        }
        if (marks >= 41 && marks < 51) {
            grade = "DD";
        }
        if (marks <= 40 && marks >= 0) {
            grade = "Fail";
        }
        return grade;
    }
}
