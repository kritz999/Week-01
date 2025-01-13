import java.util.Scanner;

public class SumOfNaturalNumbersMethod {

    // Method to calculate the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        // Loop to calculate the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Get the number of natural numbers (n)
        System.out.print("Enter the value of n (natural number): ");
        int n = scanner.nextInt();

        // Validate input (n must be a positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum using the method
            int sum = calculateSum(n);

            // Output the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

       
    }
}
