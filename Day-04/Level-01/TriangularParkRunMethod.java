import java.util.Scanner;

public class TriangularParkRunMethod {

    // Method to calculate the perimeter of a triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed
    public static int calculateRounds(double perimeter, double totalDistance) {
        return (int) Math.ceil(totalDistance / perimeter); // Use Math.ceil to round up to the nearest whole number
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input for the three sides of the triangle
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        // Validate if the sides form a valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Calculate the perimeter of the triangle
            double perimeter = calculatePerimeter(side1, side2, side3);

            // Total distance to run (5 km = 5000 meters)
            double totalDistance = 5000;

            // Calculate the number of rounds needed
            int rounds = calculateRounds(perimeter, totalDistance);

            // Output the result
            System.out.println("The athlete needs to complete " + rounds + " rounds to finish a 5 km run.");
        } else {
            System.out.println("The entered sides do not form a valid triangle. Please enter valid side lengths.");
        }

        // Close the scanner
        scanner.close();
    }
}
