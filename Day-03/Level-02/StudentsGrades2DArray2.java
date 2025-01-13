import java.util.Scanner;

public class StudentGrades2DArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the total number of students: ");
        int studentCount = scanner.nextInt();

        // 2D Array to store marks for Physics, Chemistry, and Maths for each student
        int[][] marks = new int[studentCount][3]; // 3 columns: 0 -> Physics, 1 -> Chemistry, 2 -> Maths
        double[] percentages = new double[studentCount];
        char[] grades = new char[studentCount];

        // Input marks for each student
        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            System.out.println("\nEntering marks for Student " + (studentIndex + 1));

            // Input marks for Physics
            while (true) {
                System.out.print("Enter Physics marks: ");
                marks[studentIndex][0] = scanner.nextInt();
                if (marks[studentIndex][0] >= 0) break;
                System.out.println("Invalid input! Please enter a non-negative number.");
            }

            // Input marks for Chemistry
            while (true) {
                System.out.print("Enter Chemistry marks: ");
                marks[studentIndex][1] = scanner.nextInt();
                if (marks[studentIndex][1] >= 0) break;
                System.out.println("Invalid input! Please enter a non-negative number.");
            }

            // Input marks for Maths
            while (true) {
                System.out.print("Enter Maths marks: ");
                marks[studentIndex][2] = scanner.nextInt();
                if (marks[studentIndex][2] >= 0) break;
                System.out.println("Invalid input! Please enter a non-negative number.");
            }
        }

        // Compute percentages and grades
        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            int totalMarks = marks[studentIndex][0] + marks[studentIndex][1] + marks[studentIndex][2];
            percentages[studentIndex] = totalMarks / 3.0;

            // Assign grade based on percentage
            if (percentages[studentIndex] >= 80) {
                grades[studentIndex] = 'A';
            } else if (percentages[studentIndex] >= 70) {
                grades[studentIndex] = 'B';
            } else if (percentages[studentIndex] >= 60) {
                grades[studentIndex] = 'C';
            } else if (percentages[studentIndex] >= 50) {
                grades[studentIndex] = 'D';
            } else if (percentages[studentIndex] >= 40) {
                grades[studentIndex] = 'E';
            } else {
                grades[studentIndex] = 'R';
            }
        }

        // Display the report
        System.out.println("\nFinal Report:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-10s\n", 
                "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int studentIndex = 0; studentIndex < studentCount; studentIndex++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-15.2f %-10c\n",
                    (studentIndex + 1), 
                    marks[studentIndex][0], 
                    marks[studentIndex][1], 
                    marks[studentIndex][2], 
                    percentages[studentIndex], 
                    grades[studentIndex]);
        }
    }
}
