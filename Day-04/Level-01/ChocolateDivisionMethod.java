import java.util.Scanner;

public class ChocolateDivisionMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of chocolates and number of children
        System.out.println("Enter the number of chocolates:");
        int numberOfChocolates = sc.nextInt();

        System.out.println("Enter the number of children:");
        int numberOfChildren = sc.nextInt();

        // Call the method to find quotient (chocolates per child) and remainder (remaining chocolates)
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close(); // Close the scanner
    }

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Calculate how many chocolates each child gets
        int remainder = number % divisor; // Calculate the remaining chocolates

        // Return the results as an array: [quotient, remainder]
        return new int[]{quotient, remainder};
    }
}
