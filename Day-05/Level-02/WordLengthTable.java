
import java.util.Scanner;

public class WordLengthTable {

    // Method to find the length of a string without using the built-in length() method
    public static int findLengthWithoutBuiltIn(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Attempt to access each character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split the text into words using charAt() without using the built-in split() method
    public static String[] splitTextUsingCharAt(String text) {
        int length = findLengthWithoutBuiltIn(text);
        int wordCount = 1; // At least one word exists
        int[] spaceIndexes = new int[length];
        
        // Count spaces and store their indexes
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
                wordCount++;
            }
        }

        // Create an array to store the words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;

        // Extract words using space indexes
        for (int i = 0; i < wordCount; i++) {
            int endIndex = (i < wordCount - 1) ? spaceIndexes[i] : length;
            words[wordIndex++] = text.substring(startIndex, endIndex).trim();
            startIndex = spaceIndexes[i] + 1;
        }

        return words;
    }

    // Method to create a 2D array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int wordLength = findLengthWithoutBuiltIn(words[i]);
            wordLengthArray[i][0] = words[i]; // Store the word
            wordLengthArray[i][1] = String.valueOf(wordLength); // Store the word's length as a string
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String inputText = scanner.nextLine();

        // Split the text into words using the user-defined method
        String[] words = splitTextUsingCharAt(inputText);

        // Get the 2D array of words and their lengths
        String[][] wordLengthArray = getWordsAndLengths(words);

        // Display the results in a tabular format
        System.out.println("Word\t\tLength");
        System.out.println("---------------------");
        for (String[] wordAndLength : wordLengthArray) {
            // Convert the length value to Integer and display in a readable format
            System.out.printf("%-15s%-10d\n", wordAndLength[0], Integer.parseInt(wordAndLength[1]));
        }

        scanner.close();
    }
}




