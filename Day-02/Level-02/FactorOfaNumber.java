import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Step 1: Get user input for the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Print the factors of the number
        System.out.println("The factors of " + number + " are:");

        // Step 3: Run a loop from i = 1 to i < number
        for (int i = 1; i <= number; i++) {
            // Step 4: Check if number is divisible by i
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }

        // Close the scanner
        scanner.close();
    }
}
