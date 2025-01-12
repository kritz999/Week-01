import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Step 1: Get integer input for the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize the greatestFactor variable to 1
        int greatestFactor = 1;

        // Step 3: Create a for loop to find the greatest factor of the number
        for (int i = number - 1; i >= 1; i--) {
            // Step 4: Check if number is divisible by i
            if (number % i == 0) {
                greatestFactor = i; // Assign the factor to greatestFactor
                break; // Exit the loop as we've found the greatest factor
            }
        }

        // Step 5: Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        // Step 6: Close the scanner
        scanner.close();
    }
}
