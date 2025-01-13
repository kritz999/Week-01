import java.util.Scanner;

public class StudentGradesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the total number of students: ");
        int studentCount = scanner.nextInt();

        // Arrays to hold data for marks, percentages, and grades
        int[] physicsMarks = new int[studentCount];
        int[] chemistryMarks = new int[studentCount];
        int[] mathsMarks = new int[studentCount];
        double[] calculatedPercentages = new double[studentCount];
        char[] assignedGrades = new char[studentCount];

        // Input marks for each student
        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            System.out.println("\nEntering marks for Student " + (studentIndex + 1));

            // Input Physics marks
            while (true) {
                System.out.print("Enter Physics marks: ");
                physicsMarks[studentIndex] = scanner.nextInt();
                if (physicsMarks[studentIndex] >= 0) break;
                System.out.println("Invalid input! Please enter a non-negative number.");
            }

            // Input Chemistry marks
            while (true) {
                System.out.print("Enter Chemistry marks: ");
                chemistryMarks[studentIndex] = scanner.nextInt();
                if (chemistryMarks[studentIndex] >= 0) break;
                System.out.println("Invalid input! Please enter a non-negative number.");
            }

            // Input Maths marks
            while (true) {
                System.out.print("Enter Maths marks: ");
                mathsMarks[studentIndex] = scanner.nextInt();
                if (mathsMarks[studentIndex] >= 0) break;
                System.out.println("Invalid input! Please enter a non-negative number.");
            }
        }

        // Compute percentages and grades
        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            int totalMarks = physicsMarks[studentIndex] + chemistryMarks[studentIndex] + mathsMarks[studentIndex];
            calculatedPercentages[studentIndex] = totalMarks / 3.0;

            // Assign grade based on percentage
            if (calculatedPercentages[studentIndex] >= 80) {
                assignedGrades[studentIndex] = 'A';
            } else if (calculatedPercentages[studentIndex] >= 70) {
                assignedGrades[studentIndex] = 'B';
            } else if (calculatedPercentages[studentIndex] >= 60) {
                assignedGrades[studentIndex] = 'C';
            } else if (calculatedPercentages[studentIndex] >= 50) {
                assignedGrades[studentIndex] = 'D';
            } else if (calculatedPercentages[studentIndex] >= 40) {
                assignedGrades[studentIndex] = 'E';
            } else {
                assignedGrades[studentIndex] = 'R';
            }
        }

        // Display the report
        System.out.println("\nFinal Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-10s\n", 
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-15.2f %-10c\n",
                    studentIndex + 1, 
                    physicsMarks[studentIndex], 
                    chemistryMarks[studentIndex], 
                    mathsMarks[studentIndex], 
                    calculatedPercentages[studentIndex], 
                    assignedGrades[studentIndex]);
        }
    }
}
