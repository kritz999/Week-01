import java.util.Scanner;

public class HandshakeCalculatorMethod {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        // Using the formula: n * (n - 1) / 2
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Validate input (number of students should be non-negative)
        if (n < 0) {
            System.out.println("Number of students cannot be negative. Please enter a valid number.");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(n);

            // Output the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }

        // Close the scanner
        scanner.close();
    }
}
