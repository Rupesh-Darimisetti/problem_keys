import java.util.Scanner;

// 12. Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the
// square of the third number).
public class PythagoreanTripletOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of triangle to find Pythagorean triplet or not");
        System.out.print("Enter First side:\t");
        int first_side = input.nextInt();
        System.out.print("Enter Second side:\t");
        int second_side = input.nextInt();
        System.out.print("Enter Third side:\t");
        int third_side = input.nextInt();
        String pythagorean_triplet = pythagoreanTriplet(first_side, second_side, third_side);
        System.out.println(pythagorean_triplet);
    }
    private static String pythagoreanTriplet(int first_side, int second_side, int third_side) {
        String message = "The Given triplet is not Pythagorean triplet";
        first_side = first_side * first_side;
        second_side = second_side *second_side;
        third_side = third_side * third_side;
        if (first_side == (second_side + third_side) ||
            second_side == (first_side + third_side)||
            third_side == (first_side+ second_side)){
            message = "Pythagorean triplet";
        }
        return message;
    }
}
