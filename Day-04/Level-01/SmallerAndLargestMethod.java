import java.util.Scanner;

public class SmallestAndLargestMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for 3 numbers
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int number3 = sc.nextInt();

        // Call the method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        sc.close(); // Close the scanner
    }

    // Method to find the smallest and largest of 3 numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Find the smallest number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Find the largest number
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return the results as an array
        return new int[]{smallest, largest};
    }
}
