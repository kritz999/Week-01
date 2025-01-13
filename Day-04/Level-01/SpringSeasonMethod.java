public class SpringSeasonMethod {

    // Method to check if the given date falls in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Check for dates from March 20 to June 20
        if ((month == 3 && day >= 20 && day <= 31) ||  // March 20–31
            (month == 4 && day >= 1 && day <= 30) ||   // April 1–30
            (month == 5 && day >= 1 && day <= 31) ||   // May 1–31
            (month == 6 && day >= 1 && day <= 20)) {   // June 1–20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Validate month and day input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid input. Please enter a valid month (1-12) and day (1-31).");
            return;
        }

        // Check if the date is in Spring season
        boolean isSpring = isSpringSeason(month, day);

        // Output the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
