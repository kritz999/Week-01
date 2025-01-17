import java.util.Scanner;

public class TextToUppercase {

    // User-defined method to convert a string to uppercase using ASCII logic
    public static String toUpperCaseUsingCharAt(String text) {
        StringBuilder upperCaseText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if the character is lowercase (ASCII range: 'a' to 'z')
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase by subtracting 32
            }

            // Append the character to the result
            upperCaseText.append(ch);
        }

        return upperCaseText.toString();
    }

    // User-defined method to compare two strings character by character
    public static boolean compareStrings(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text from the user
        System.out.print("Enter text: ");
        String inputText = sc.nextLine();

        // Convert the text to uppercase using the user-defined method
        String userDefinedUpper = toUpperCaseUsingCharAt(inputText);

        // Convert the text to uppercase using the built-in method
        String builtInUpper = inputText.toUpperCase();

        // Compare the results
        boolean areEqual = compareStrings(userDefinedUpper, builtInUpper);

        // Display the results
        System.out.println("User-defined uppercase result: " + userDefinedUpper);
        System.out.println("Built-in uppercase result: " + builtInUpper);
        System.out.println("Are the two results equal? " + areEqual);

        sc.close();
    }
}
