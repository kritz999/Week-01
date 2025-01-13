import java.util.Scanner;

public class QuotientRemainderCalculatorMethod {

    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder
        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number (dividend) and divisor from the user
        System.out.print("Enter the number (dividend): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Validate divisor (it should not be zero)
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please enter a valid divisor.");
        } else {
            // Call the method to calculate quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Output the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
