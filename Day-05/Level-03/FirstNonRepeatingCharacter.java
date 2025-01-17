import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string using charAt() method
    public static char findFirstNonRepeatingCharacter(String text) {
        // Create an array to store the frequency of characters (for all ASCII characters)
        int[] frequency = new int[256]; // 256 for all ASCII characters

        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Loop through the text again to find the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return a special character (could also throw an exception)
        return '\0'; // Null character, indicating no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Call the method to find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(inputText);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }

        scanner.close();
    }
}
