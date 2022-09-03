package assignment123Functions.flowOfProgram;

import java.util.Scanner;
// 3. Take a number as input and print the multiplication table for it
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for what you want a table:\t");
        int table_num = input.nextInt();
        table(table_num);
    }

    private static void table(int table_num) {
        for (int multiple = 1; multiple <= 20; multiple++) {
            int multipled = table_num * multiple;
            System.out.println(table_num + " x " + multiple + " = " + multipled);
        }
    }

}
