import java.util.Scanner;

public class NaturalNumberSumMethod {

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        // Base case: sum of 0 is 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: sum of n is n + sum of (n-1)
        return n + sumRecursive(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Get the value of n from the user
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Calculate the sum using recursion
            int recursiveSum = sumRecursive(n);

            // Calculate the sum using the formula
            int formulaSum = sumFormula(n);

            // Output the results
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Compare the results
            if (recursiveSum == formulaSum) {
                System.out.println("Both methods give the same result. The computation is correct.");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
