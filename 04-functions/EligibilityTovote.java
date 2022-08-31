import java.util.Scanner;

// 3. A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
public class EligibilityTovote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age of person to find that he/she is eligible to vote: ");
        int age_of_person = input.nextInt();
        String eligibility_to_vote = eligibleToVoteOrNot(age_of_person);
        System.out.println("A person with " + age_of_person + " years of age is " + eligibility_to_vote);
    }

    private static String eligibleToVoteOrNot(int age_of_person) {
        return age_of_person >= 18 ? "Eligible To Vote" : "Not Eligible to vote";
    }
}
