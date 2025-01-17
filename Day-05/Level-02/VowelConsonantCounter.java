import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char c) {
        // Convert character to lowercase if it is uppercase
        if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
        }

        // Check if the character is a vowel or consonant
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return "Vowel";
        } else if (Character.isLetter(c)) {
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to count vowels and consonants in the string using charAt()
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String result = checkCharacterType(currentChar);

            // Count vowels and consonants
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the count of vowels and consonants in an array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Get the counts of vowels and consonants using the user-defined method
        int[] counts = countVowelsAndConsonants(inputText);

        // Display the results
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }
}
