import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        StringBuilder uniqueChars = new StringBuilder();

        // Loop through the string and find unique characters
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (uniqueChars.indexOf(String.valueOf(c)) == -1) { // Check if character is already in the result
                uniqueChars.append(c);
            }
        }

        // Convert the StringBuilder to a char array and return
        char[] uniqueCharsArray = new char[uniqueChars.length()];
        for (int i = 0; i < uniqueChars.length(); i++) {
            uniqueCharsArray[i] = uniqueChars.charAt(i);
        }
        return uniqueCharsArray;
    }

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text, char[] uniqueChars) {
        // Create an array to store the frequency of characters (size 256 for all ASCII characters)
        int[] frequency = new int[256];

        // Loop through the string to calculate frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = Character.toString(c);
            result[i][1] = Integer.toString(frequency[c]);
        }

        return result;
    }

    // Main method to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();
        
        // Calling the method to find unique characters
        char[] uniqueChars = uniqueCharacters(inputText);
        
        // Calling the method to find frequency of unique characters
        String[][] frequencies = findFrequency(inputText, uniqueChars);
        
        // Displaying the result
        System.out.println("Character Frequency:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }
        
        scanner.close();
    }
}
