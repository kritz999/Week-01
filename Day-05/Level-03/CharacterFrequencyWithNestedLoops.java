import java.util.Scanner;

public class CharacterFrequencyWithNestedLoops {

    // Method to find the frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        // Convert the string to a char array
        char[] chars = text.toCharArray();
        
        // Array to store frequency of each character
        int[] frequency = new int[chars.length];
        
        // String array to store the characters and their frequencies
        String[] result = new String[chars.length];
        
        // Outer loop to iterate through each character in the text
        for (int i = 0; i < chars.length; i++) {
            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }
            
            // Initialize frequency of the current character to 1
            frequency[i] = 1;
            
            // Inner loop to check for duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    // Increment frequency and mark the duplicate as '0' to avoid counting it again
                    frequency[i]++;
                    chars[j] = '0'; // Mark duplicate character
                }
            }
            
            // Store character and its frequency in the result array
            if (chars[i] != '0') {
                result[i] = chars[i] + ": " + frequency[i];
            }
        }
        
        return result;
    }

    // Main method to take user input and display the result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();
        
        // Calling the method to find frequency of characters
        String[] frequencies = findFrequency(inputText);
        
        // Displaying the result
        System.out.println("Character Frequency:");
        for (String res : frequencies) {
            if (res != null) {
                System.out.println(res);
            }
        }
        
        scanner.close();
    }
}
