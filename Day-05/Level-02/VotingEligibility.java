import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random ages for 'n' students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];

        // Generate random 2-digit ages for n students
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(33) + 18;  // Generates a random age between 18 and 50
        }

        return ages;
    }

    // Method to check if each student can vote based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            // Validate age to be non-negative
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid age (cannot vote)";
            } else {
                // Check if the student can vote (age >= 18)
                if (ages[i] >= 18) {
                    result[i][0] = String.valueOf(ages[i]);
                    result[i][1] = "Can Vote";
                } else {
                    result[i][0] = String.valueOf(ages[i]);
                    result[i][1] = "Cannot Vote";
                }
            }
        }

        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Age\t\tVoting Eligibility");
        System.out.println("-----------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the number of students (though fixed at 10 in this case)
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Generate random ages for the students
        int[] ages = generateAges(n);

        // Check voting eligibility for each student
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results
        displayResult(eligibility);

        scanner.close();
    }
}
