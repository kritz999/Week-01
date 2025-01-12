import java.util.Scanner;

public class PrimeNumbe {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Check if the number is greater than 1
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true; // Initialize isPrime as true

            // Step 3: Check divisibility from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) { // If divisible, it's not a prime number
                    isPrime = false;
                    break; // Break the loop as we found a divisor
                }
            }

            // Step 4: Display result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
