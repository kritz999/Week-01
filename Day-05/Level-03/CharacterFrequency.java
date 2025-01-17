import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        // Create an array to store the frequency of characters (for all ASCII characters)
        int[] frequency = new int[256]; // 256 for all ASCII characters

        // Loop through the text to count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment the frequency of the character
        }

        // Create an array to store the characters and their frequencies
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++; // Count how many unique characters exist
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        // Loop through the frequency array and store characters and frequencies in the result array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); // Store the character
                result[index][1] = String.valueOf(frequency[i]); // Store the frequency
                index++;
            }
        }

        return result; // Return the 2D array
    }

    // Method to display the 2D array in tabular format
    public static void displayResult(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "         | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Call the method to find character frequencies
        String[][] result = findCharacterFrequency(inputText);

        // Call the method to display the result in tabular format
        displayResult(result);

        scanner.close();
    }
}
