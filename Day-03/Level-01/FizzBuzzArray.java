import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.println("Enter a positive integer:");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return; // Exit if the input is not a positive number
        }

        // Create a String array to store the results
        String[] results = new String[number + 1]; // Array size is number + 1 to include 0

        // Loop to fill the array with Fizz, Buzz, or the number
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i); // Store the number itself if not a multiple of 3 or 5
            }
        }

        // Print the results in the required format
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
