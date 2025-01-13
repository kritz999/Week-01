import java.util.Scanner;

public class NumberAnalysisMethod {

    // Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 == number2) {
            return 0; // both are equal
        } else {
            return -1; // number1 is less
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Process each number
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (isPositive(number)) {
                System.out.print("Number " + number + " is positive");
                if (isEven(number)) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else {
                System.out.println("Number " + number + " is negative.");
            }
        }

        // Compare the first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);

        // Display comparison result
        System.out.print("The first number (" + numbers[0] + ") is ");
        if (comparisonResult == 1) {
            System.out.println("greater than the last number (" + numbers[numbers.length - 1] + ").");
        } else if (comparisonResult == 0) {
            System.out.println("equal to the last number (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("less than the last number (" + numbers[numbers.length - 1] + ").");
        }

        scanner.close();
    }
}
