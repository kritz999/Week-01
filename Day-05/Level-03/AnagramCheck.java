import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // If lengths are not equal, they can't be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store frequency of characters
        int[] frequency1 = new int[256]; // Array for text1
        int[] frequency2 = new int[256]; // Array for text2

        // Loop through both strings to count the frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; // If frequencies are not the same, not anagrams
            }
        }

        return true; // If frequencies are equal, it's an anagram
    }

    // Main method to take user input and check for anagrams
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.println("Enter the first text:");
        String text1 = scanner.nextLine();
        
        System.out.println("Enter the second text:");
        String text2 = scanner.nextLine();

        // Calling the method to check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Displaying the result
        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }

        scanner.close();
    }
}
