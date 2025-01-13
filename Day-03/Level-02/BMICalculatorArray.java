import java.util.Scanner;

public class BMICalculatorArrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberPersons = sc.nextInt();

        // Step 2: Create arrays to store weight, height, BMI, and weight status
        double[] weights = new double[numberPersons];
        double[] heights = new double[numberPersons];
        double[] bmiValues = new double[numberPersons];
        String[] statuses = new String[numberPersons];

        // Step 3: Take input for weight and height for each person
        for (int i = 0; i < numberPersons; i++) {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Step 4: Calculate BMI and determine weight status
        for (int i = 0; i < numberPersons; i++) {
            bmiValues[i] = weights[i] / (heights[i] * heights[i]); // BMI formula

            // Determine weight status based on BMI
            if (bmiValues[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmiValues[i] >= 25 && bmiValues[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        // Step 5: Display the details for each person
        System.out.println("\nBMI Report:");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < numberPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmiValues[i], statuses[i]);
        }
    }
}
