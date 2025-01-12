import java.util.*;

public class AbundantNumber {
    public static void main(String[] args) {
        // Step 1: Get the input number from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Step 2: Initialize sum to 0
        	int sum = 0;

        // Step 3: Find all divisors of the number and calculate their sum
       		 for (int i = 1; i < num; i++) { // Loop from 1 to number - 1
           	 if (num % i == 0) { // Check if i is a divisor of the number
                 sum += i; // Add the divisor to the sum
            }
        }

        // Step 4: Check if the sum of divisors is greater than the number
        	if (sum > num) {
           	 System.out.println(num + " is an Abundant Number.");
       		 } 	else {
            System.out.println(num + " is not an Abundant Number.");
        }

       
    }
}
