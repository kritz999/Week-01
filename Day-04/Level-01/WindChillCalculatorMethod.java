import java.util.Scanner;

public class WindChillCalculatorMethod {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind Chill formula
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Get temperature and wind speed from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Check if wind speed is positive
        if (windSpeed <= 0) {
            System.out.println("Wind speed must be greater than zero.");
        } else {
            // Calculate the wind chill using the method
            double windChill = calculateWindChill(temperature, windSpeed);

            // Output the result
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }

        // Close the scanner
        scanner.close();
    }
}
