import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams
        boolean isAnagram = checkAnagram(str1, str2);

        // Print the result
        if (isAnagram) {
            System.out.println("The strings are anagrams of each other.");
        } else {
            System.out.println("The strings are NOT anagrams of each other.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagram(String str1, String str2) {
        // Remove spaces and convert strings to lowercase for case-insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not the same, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
