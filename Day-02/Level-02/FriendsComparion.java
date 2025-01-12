import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input ages and heights for Amar, Akbar, and Anthony
        System.out.println("Enter the age and height of Amar:");
        int ageAmar = scanner.nextInt();
        float heightAmar = scanner.nextFloat();

        System.out.println("Enter the age and height of Akbar:");
        int ageAkbar = scanner.nextInt();
        float heightAkbar = scanner.nextFloat();

        System.out.println("Enter the age and height of Anthony:");
        int ageAnthony = scanner.nextInt();
        float heightAnthony = scanner.nextFloat();

        // Step 2: Find the youngest friend (smallest age)
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";

        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Step 3: Find the tallest friend (largest height)
        float tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";

        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Step 4: Display the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " meters.");

        // Close the scanner
        scanner.close();
    }
}
