import java.util.Scanner;

public class StringLengthWithoutBuiltIn {

    // Method to find the length of a string without using the length() method
    public static int findLengthWithoutBuiltIn(String text) {
        int count = 0;
        
        try {
            // Using infinite loop to count characters until charAt() throws an exception
            while (true) {
                text.charAt(count); // Try accessing the character at the current count
                count++; // If successful, increment the count
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception is caught when count exceeds string length, so return the count
            return count;
        }
    }

    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String inputText = scanner.next();

        // Finding length using the user-defined method
        int lengthWithoutBuiltIn = findLengthWithoutBuiltIn(inputText);
        
        // Finding length using the built-in length() method
        int lengthWithBuiltIn = inputText.length();
        
        // Display the results
        System.out.println("Length using user-defined method: " + lengthWithoutBuiltIn);
        System.out.println("Length using built-in length() method: " + lengthWithBuiltIn);
        
        scanner.close();
    }
}
