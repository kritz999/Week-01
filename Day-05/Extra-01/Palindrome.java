import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Entering the string from the user
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        // Reverse the string
        String reversedString = reverseString(s1);

        // Check if the original string is a palindrome
        if (s1.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }

    // Method to reverse a string
    public static String reverseString(String s1) {
        String reversed = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed += s1.charAt(i);
        }

        return reversed;
    }
}
