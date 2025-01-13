import java.util.Scanner;

public class WordLength2DArray {

    // Method to split the text into words using charAt() without split()
    public static String[] splitTextIntoWords(String text) {
        String[] words = new String[100]; // Assuming a maximum of 100 words
        int wordCount = 0;
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ') { // If the character is not a space, append to current word
                currentWord.append(ch);
            } else if (currentWord.length() > 0) { // Save the word when a space is encountered
                words[wordCount++] = currentWord.toString();
                currentWord.setLength(0); // Clear the StringBuilder for the next word
            }
        }

        // Add the last word if the text doesn't end with a space
        if (currentWord.length() > 0) {
            words[wordCount++] = currentWord.toString();
        }

        // Create a result array with the exact number of words
        String[] result = new String[wordCount];
        System.arraycopy(words, 0, result, 0, wordCount);
        return result;
    }

    // Method to calculate the length of a string without using length()
    public static int calculateLength(String word) {
        int length = 0;
        for (char ignored : word.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = String.valueOf(calculateLength(words[i])); // Length as String
        }

        return wordLengthArray;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text from the user
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(text);

        // Create a 2D array of words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Display the result in a tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }

        sc.close();
    }
}
