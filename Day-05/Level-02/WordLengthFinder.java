import java.util.Scanner;

public class WordLengthFinder {

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

    // Method to find the shortest and longest string and return them in a 1D array
    public static String[] findShortestAndLongestString(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            int shortestLength = findLengthWithoutBuiltIn(shortestWord);
            int longestLength = findLengthWithoutBuiltIn(longestWord);

            if (currentLength < shortestLength) {
                shortestWord = wordLengthArray[i][0];
            }
            if (currentLength > longestLength) {
                longestWord = wordLengthArray[i][0];
            }
        }

        return new String[]{shortestWord, longestWord};
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

        // Find the shortest and longest word using the user-defined method
        String[] shortestAndLongest = findShortestAndLongestString(wordLengthArray);

        // Display the results
        System.out.println("Shortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);
        
        scanner.close();
    }
}
