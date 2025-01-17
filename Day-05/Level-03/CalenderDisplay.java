import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4 but not divisible by 100 unless divisible by 400
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to get the first day of the month using the Gregorian calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        // Applying the Gregorian calendar algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        
        return d0;  // Returns the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the month name
        String monthName = getMonthName(month);
        System.out.println("    " + monthName + " " + year);
        
        // Print the day headers
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Get the number of days in the month
        int numberOfDays = getNumberOfDaysInMonth(month, year);
        
        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // Printing 4 spaces for each day before the first day of the month
        }
        
        // Display the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            
            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        
        // Move to the next line if the last line is not complete
        if ((firstDay + numberOfDays) % 7 != 0) {
            System.out.println();
        }
    }

    // Main method to take user input and display the calendar
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(month, year);
        
        scanner.close();
    }
}
