import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop through and compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end index, return true
        if (start >= end) {
            return true;
        }
        // Check if characters at start and end are equal
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive call to check the next characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Method using character arrays to check palindrome
    public static boolean isPalindromeUsingArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = reverseString(text).toCharArray();

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    // Main method to take user input and check palindrome using all three methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string to check if it is a palindrome:");
        String inputText = scanner.nextLine();

        // Check palindrome using all three methods
        boolean isPalindromeIter = isPalindromeIterative(inputText);
        boolean isPalindromeRec = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean isPalindromeArray = isPalindromeUsingArray(inputText);

        // Displaying the result for each method
        System.out.println("Using Iterative Method: " + (isPalindromeIter ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursive Method: " + (isPalindromeRec ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Character Array Method: " + (isPalindromeArray ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}
