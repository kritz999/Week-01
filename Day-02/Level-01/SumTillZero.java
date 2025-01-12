import java.util.*;

public class SumUntilZero {
    public static void main(String[] args) {
        // Initialize variables
        double total = 0.0;
        double userInput;

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers to sum , enter 0 to stop");

        // Get the first input from the user
        System.out.print("Enter a number ");
        userInput = sc.nextDouble();

        // Use a while loop to check if the input is not 0
        while (userInput != 0) {
            // Add the input to the total
             total += userInput;

            // Prompt the user for the next input
             System.out.print("Enter a number: ");
             userInput = sc.nextDouble();
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        
    }
}