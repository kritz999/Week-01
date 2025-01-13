import java.util.Random;

public class ZaraBonusMethod {
    public static void main(String[] args) {
        // Create a 2D array to store salary and years of service for 10 employees
        double[][] employeeData = new double[10][2]; // [0] - salary, [1] - years of service
        double[][] updatedEmployeeData; // To store updated salary and bonus

        // Generate random salary and years of service for each employee
        generateEmployeeData(employeeData);

        // Calculate new salary and bonus
        updatedEmployeeData = calculateNewSalaryAndBonus(employeeData);

        // Calculate and display the total bonus and salaries
        calculateAndDisplayTotal(employeeData, updatedEmployeeData);
    }

    // Method to generate random salary and years of service
    public static void generateEmployeeData(double[][] data) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            // Randomly generate a 5-digit salary (between 10000 and 99999)
            data[i][0] = rand.nextInt(90000) + 10000;

            // Randomly generate years of service (between 1 and 20 years)
            data[i][1] = rand.nextInt(20) + 1;
        }
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] updatedData = new double[10][3]; // [0] - salary, [1] - years of service, [2] - bonus + new salary

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int yearsOfService = (int) data[i][1];
            double bonus = 0.0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus for more than 5 years
            } else {
                bonus = salary * 0.02; // 2% bonus for 5 years or less
            }

            // Calculate new salary
            double newSalary = salary + bonus;

            // Store the data: [0] - old salary, [1] - years of service, [2] - new salary + bonus
            updatedData[i][0] = salary;
            updatedData[i][1] = yearsOfService;
            updatedData[i][2] = newSalary;
        }

        return updatedData;
    }

    // Method to calculate total old salary, new salary, and bonus amount
    public static void calculateAndDisplayTotal(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Calculate total values
        for (int i = 0; i < 10; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][2];
            totalBonus += newData[i][2] - oldData[i][0]; // Difference between new salary and old salary is the bonus
        }

        // Display the data in a tabular format
        System.out.println("-----------------------------------------------------------");
        System.out.println("Employee # | Old Salary | Years of Service | New Salary | Bonus");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%10d | %10.2f | %16.0f | %10.2f | %5.2f\n",
                    i + 1, oldData[i][0], oldData[i][1], newData[i][2], newData[i][2] - oldData[i][0]);
        }

        // Display totals
        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }
}
