import java.util.Scanner;

public class MaximumHandshakesMethod2 {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validate the input (number of students should be non-negative)
        if (numberOfStudents < 0) {
            System.out.println("The number of students cannot be negative. Please enter a valid number.");
        } else {
            // Calculate the maximum number of handshakes using the formula
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Output the result
            System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is: " + handshakes);
        }

        // Close the scanner
        scanner.close();
    }
}
