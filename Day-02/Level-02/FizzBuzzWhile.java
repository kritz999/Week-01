import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Step 2: Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Step 3: Initialize counter for the while loop
            int i = 0;

            // Step 4: Use a while loop to iterate from 0 to the entered number
            while (i <= number) {
                // Step 5: Check divisibility conditions
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                // Increment the counter
                i++;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
