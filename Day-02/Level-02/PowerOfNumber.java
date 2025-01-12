import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Step 1: Get user input for number and power
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Step 2: Initialize result to 1
        int result = 1;

        // Step 3: Loop to multiply the number with result, power times
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result with number in each iteration
        }

        // Step 4: Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
