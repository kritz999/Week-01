import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversedString = reverseString(input);

        // Display the result
        System.out.println("Reversed string: " + reversedString);

       
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";

        // Iterate through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
           reversed += str.charAt(i); 
        }

        return reversed;
    }
}
