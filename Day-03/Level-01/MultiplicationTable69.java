import java.util.Scanner;

public class MultiplicationTable69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take integer input for the number
        System.out.print("Enter a number (between 6 and 9) to display its multiplication table: ");
        int number = scanner.nextInt();

        // Validate that the number is between 6 and 9
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return; // Exit the program if the number is not within the valid range
        }

        // Define an array to store multiplication results (1 to 10)
        int[] multiplicationResult = new int[10];

        // Calculate the multiplication table for the entered number
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }
    }
}
