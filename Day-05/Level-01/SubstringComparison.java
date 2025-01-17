
import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        
        return substring.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // If lengths differ, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String inputText = scanner.next();
        
        System.out.println("Enter the start index for the substring:");
        int startIndex = scanner.nextInt();
        
        System.out.println("Enter the end index for the substring:");
        int endIndex = scanner.nextInt();
        
        // Create the substring using the charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(inputText, startIndex, endIndex);
        
        // Create the substring using the built-in substring() method
        String substringUsingBuiltIn = inputText.substring(startIndex, endIndex);
        
        // Compare both substrings
        boolean areEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);
        
        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using built-in substring(): " + substringUsingBuiltIn);
        System.out.println("Do both methods produce the same result? " + areEqual);
        
        scanner.close();
    }
}




