import java.util.Scanner;

public class DigitFrequencyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Define an array to store the frequency of digits (0 to 9)
        int[] frequency = new int[10];

        // Step 3: Extract digits from the number and update the frequency array
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            frequency[digit]++;      // Increment the frequency of the digit
            number /= 10;            // Remove the last digit
        }

        // Step 4: Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
