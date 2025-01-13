import java.util.Scanner;

public class FriendsComparisonHeightArray.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextInt();
        }

        // Finding the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Finding the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Printing the results
        System.out.println("The youngest friend is " + friends[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex]);
    }
}