import java.util.Random;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];  // 2D array to hold scores for Physics, Chemistry, and Math

        // Generate random scores for each subject (between 50 and 100)
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(51) + 50;  // Physics score (50-100)
            scores[i][1] = rand.nextInt(51) + 50;  // Chemistry score (50-100)
            scores[i][2] = rand.nextInt(51) + 50;  // Math score (50-100)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][4];  // 2D array to hold total, average, and percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];  // Total marks
            double average = total / 3.0;  // Average marks
            double percentage = (total / 300.0) * 100;  // Percentage

            // Round off the values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrade(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Scorecard:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%7d | %7d | %8d | %4d | %5.2f | %7.2f | %10.2f | %s\n",
                i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5;  // Number of students, can be changed as needed

        // Generate random scores for the students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores);

        // Calculate grades based on percentage
        String[] grades = calculateGrade(results);

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
