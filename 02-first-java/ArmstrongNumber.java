// 9. To find Armstrong Number between two given number.
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // necessary variables
        final int firstNumber;
        final int secondNumber;

        Scanner input = new Scanner(System.in);
        //  take necessary parameters from user
        System.out.print("Enter First number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter Second number: ");
        secondNumber = input.nextInt();
        // loops from first to last number
        for (int num = firstNumber; num <= secondNumber; num++) {
            String no = armstrongNum(num);
            if (!"".equals(no)) {
                System.out.print(no + " ");
            }
        }
    }

    /**
     * @param num
     * check the number is armstrong or not.
     * split the number into individual no.
     * multiply the same number thrice to itself
     * add all the multiplied individual numbers
     * @return num in form of string if valid else empty string
     */
    private static String armstrongNum(int num) {
        int sum = 0;
        final int temp = num;
        
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem,3);
            num /= 10;
        }
        return  (temp == sum) ? Integer.toString(temp) : "";
    }
}
