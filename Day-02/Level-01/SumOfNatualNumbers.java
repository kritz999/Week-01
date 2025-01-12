import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
         System.out.print("Enter a positive integer  ");
         int n = sc.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The input is not a natural number. Please enter a positive integer.");
        } else {
            // Calculate sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Calculate sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Comparing the two sums
           System.out.println("Sum using formula: " + formulaSum);
             System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both methods gives the same result!");
            } else {
                System.out.println("The result is missmatched");
            }
        }

       
    }
}
