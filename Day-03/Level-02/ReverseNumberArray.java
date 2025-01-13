import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive number.");
            return; // the return will take out user from the method
        }

        // Step 2: Find the count of digits in the number
       	 int temp = num;
       	 int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        // Step 3: Create an array to store the digits
        int[] digits = new int[digitCount];

        // Step 4: Extract digits and store them in the array
        int index = 0;
        while (num > 0) {
            digits[index] = num % 10; // Get the last digit
            num /= 10; // Remove the last digit
            index++;
        }

        // Step 5: Display the reversed number (digits array)
        System.out.print("The reversed number is: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]); // Display digits in reverse order
        }
        System.out.println(); // For a newline
    }
}
