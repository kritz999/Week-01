

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        // Take user input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();
        // Convert height to meters
        double heightInMeters = heightInCm / 100;
        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);
        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        // Display the result
        System.out.println("Your BMI is: " + bmi);
        System.out.println("You are: " + status);
        scanner.close();
    }
}