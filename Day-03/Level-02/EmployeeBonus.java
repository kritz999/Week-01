import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize arrays for storing salaries and years of service
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];

        // Arrays for storing new salary and bonus
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // Variables to calculate total bonus and salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take user input for salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1));

            // Input for salary
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary. Please enter a positive number.");
                } else {
                    break;
                }
            }

            // Input for years of service
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextInt();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service. Please enter a non-negative number.");
                } else {
                    break;
                }
            }
        }

        // Loop to calculate the bonus, new salary, and total salary
        for (int i = 0; i < 10; i++) {
            // Calculate the bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus for more than 5 years
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus for less than or equal to 5 years
            }

            // Calculate the new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Print the results
        System.out.println("\nBonus Payout Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " - Salary: " + salary[i] + ", Years of Service: " + yearsOfService[i] + 
                               ", Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        }

        // Print the total bonus payout and total salary details
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
