import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize sum to 0
        int sum = 0;
        int original_Number = number;

        // Step 3: Use a while loop to extract each digit and sum them
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit;              // Add the digit to sum
            number /= 10;              // Remove the last digit
        }

        // Step 4: Check if the original number is divisible by the sum of its digits
        if (original_Number % sum == 0) {
            System.out.println(original_Number + " is a Harshad Number.");
        } else {
            System.out.println(original_Number + " is not a Harshad Number.");
        }

        
    }
}
