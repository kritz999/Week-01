import java.util.Scanner;

public class YoungestTallestFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store age and height of the 3 friends
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Take input for age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is: " + names[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex] + " with height " + height[tallestIndex] + " cm");
    }
}
