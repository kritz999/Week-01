import java.util.Scanner;

public class FriendsComparisonMethod {

    // Method to find the youngest of the three friends
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        return names[youngestIndex];
    }

    // Method to find the tallest of the three friends
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        return names[tallestIndex];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Names of the three friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Find the youngest friend
        String youngestFriend = findYoungest(names, ages);

        // Find the tallest friend
        String tallestFriend = findTallest(names, heights);

        // Display the results
        System.out.println("\nThe youngest friend is " + youngestFriend + ".");
        System.out.println("The tallest friend is " + tallestFriend + ".");

        scanner.close();
    }
}
