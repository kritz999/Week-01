import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Step 1: Get user input for the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Print the multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");

        // Step 3: Run a loop backward from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            // Step 4: Check if i is a multiple of the number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }

        // Close the scanner
        scanner.close();
    }
}
