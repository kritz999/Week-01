import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using the length() method
    public static int findStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);  // Try accessing characters until an exception occurs
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;  // Return the length when exception occurs (i.e., out of bounds)
        }
    }

    // Method to find unique characters in the string using the charAt() method
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text);  // Get the length of the string
        boolean[] isUnique = new boolean[length];  // Array to track if character is unique
        char[] uniqueChars = new char[length];  // Array to store unique characters
        int uniqueCount = 0;  // To count unique characters

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUniqueChar = true;

            // Check if the current character is already seen in previous characters
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUniqueChar = false;  // Not a unique character
                    break;
                }
            }

            // If it is unique, store it in the result array
            if (isUniqueChar) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create a new array with the exact size of unique characters found
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();  // Move to the next line after printing all unique characters
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Display the result
        displayUniqueCharacters(uniqueChars);
    }
}
