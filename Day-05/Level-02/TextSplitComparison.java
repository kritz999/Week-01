import java.util.Scanner;

public class TextSplitComparison {

    // Method to find the length of a string without using the built-in length() method
    public static int findLengthWithoutBuiltIn(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
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

    // Method to compare two String arrays and return a boolean result
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        String inputText = scanner.nextLine();

        // Split the text using the user-defined method
        String[] wordsUsingCharAt = splitTextUsingCharAt(inputText);

        // Split the text using the built-in split() method
        String[] wordsUsingSplit = inputText.split(" ");

        // Compare the results of both methods
        boolean areEqual = compareStringArrays(wordsUsingCharAt, wordsUsingSplit);

        // Display the results
        System.out.println("Words using user-defined split (charAt method): ");
        for (String word : wordsUsingCharAt) {
            System.out.println(word);
        }

        System.out.println("Words using built-in split() method: ");
        for (String word : wordsUsingSplit) {
            System.out.println(word);
        }

        System.out.println("Do both methods produce the same result? " + areEqual);
        
        scanner.close();
    }
}
