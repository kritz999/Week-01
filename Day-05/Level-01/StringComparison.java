import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();

        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Compare strings using the charAt() method
        boolean charAtResult = compareStringsUsingCharAt(str1, str2);

        // Compare strings using the built-in equals() method
        boolean equalsResult = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Verify if the results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The methods produce different results.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if any character is different
            }
        }

        return true; // Strings are equal
    }
}
