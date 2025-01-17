import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for each person
    public static String[][] calculateBMI(double[][] data) {
        String[][] bmiData = new String[10][4];  // 2D array to store height, weight, BMI, and status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // Weight in kg
            double heightInCm = data[i][1];  // Height in cm
            double heightInM = heightInCm / 100;  // Convert height to meters

            // Calculate BMI using the formula BMI = weight / (height * height)
            double bmi = weight / (heightInM * heightInM);
            String status;

            // Determine the BMI status
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            // Store the data in the bmiData array
            bmiData[i][0] = String.valueOf(heightInCm) + " cm";
            bmiData[i][1] = String.valueOf(weight) + " kg";
            bmiData[i][2] = String.format("%.2f", bmi);  // Format BMI to 2 decimal places
            bmiData[i][3] = status;
        }

        return bmiData;
    }

    // Method to display the BMI data in a tabular format
    public static void displayBMI(String[][] bmiData) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Person | Height (cm) | Weight (kg) | BMI     | Status");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%6d | %12s | %12s | %7s | %s\n",
                    i + 1, bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];  // 2D array to store weight and height of 10 people

        // Take input for 10 people's height and weight
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiData = calculateBMI(data);

        // Display the results in a tabular format
        displayBMI(bmiData);
    }
}
