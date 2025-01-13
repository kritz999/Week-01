import java.util.Scanner;

public class TrigonometricCalculatorMethod {

    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double[] results = new double[3];
        results[0] = Math.sin(radians);  // Sine
        results[1] = Math.cos(radians);  // Cosine
        results[2] = Math.tan(radians);  // Tangent

        return results;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Get the angle in degrees from the user
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate the trigonometric functions using the method
        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        // Output the results
        System.out.printf("Sine of %.2f degrees: %.4f\n", angle, trigFunctions[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f\n", angle, trigFunctions[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f\n", angle, trigFunctions[2]);

        // Close the scanner
        scanner.close();
    }
}
