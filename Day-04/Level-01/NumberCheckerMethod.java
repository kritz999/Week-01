import java.util.Scanner;

public class NumberCheckerMethod {

    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check the number using the method
        int result = checkNumber(number);

        // Output the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
