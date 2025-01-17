import java.util.Scanner;

public class CharacterTypeChecker {

    // Method to check if the character is a vowel, consonant, or not a letter
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

    // Method to find vowels and consonants in a string using charAt() and return a 2D array
    public static String[][] findCharacterTypes(String text) {
        int length = text.length();
        String[][] resultArray = new String[length][2];

        // Loop through the string to identify the type of each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            String characterType = checkCharacterType(currentChar);
            resultArray[i][0] = String.valueOf(currentChar);  // Store the character
            resultArray[i][1] = characterType;  // Store the character type
        }

        return resultArray;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] resultArray) {
        System.out.println("Character\tType");
        System.out.println("------------------------");
        for (String[] row : resultArray) {
            System.out.printf("%-10s\t%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputText = scanner.nextLine();

        // Find the character types using the user-defined method
        String[][] resultArray = findCharacterTypes(inputText);

        // Display the results in tabular format
        displayCharacterTypes(resultArray);

        scanner.close();
    }
}
