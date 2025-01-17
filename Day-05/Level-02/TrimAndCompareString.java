import java.util.Scanner;

public class TrimAndCompareString {

    // Method to find the starting and ending index of a string without leading/trailing spaces
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices of the trimmed string
        return new int[]{start, end};
    }

    // Method to create a substring from the string using the charAt() method
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        // Create substring using charAt
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStringsUsingCharAt(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Trim the spaces using the charAt method
        int[] trimmedIndexes = trimSpaces(inputText);
        String trimmedTextUsingCharAt = substringUsingCharAt(inputText, trimmedIndexes[0], trimmedIndexes[1]);

        // Trim the spaces using the built-in trim() method
        String trimmedTextUsingTrimMethod = inputText.trim();

        // Compare the two trimmed strings
        boolean areStringsEqual = compareStringsUsingCharAt(trimmedTextUsingCharAt, trimmedTextUsingTrimMethod);

        // Display the results
        System.out.println("Trimmed using charAt(): \"" + trimmedTextUsingCharAt + "\"");
        System.out.println("Trimmed using trim() method: \"" + trimmedTextUsingTrimMethod + "\"");
        System.out.println("Are the trimmed strings equal? " + areStringsEqual);

        scanner.close();
    }
}
