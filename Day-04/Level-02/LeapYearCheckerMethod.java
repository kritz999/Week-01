import java.util.Scanner;

public class LeapYearCheckerMethod {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is a valid Gregorian calendar year
        if (year >= 1582) {
            // Leap year conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; // It's a leap year
            } else {
                return false; // It's not a leap year
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
            return false; // Invalid year for Gregorian calendar
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Get the year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year using the method
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        scanner.close();
    }
}
