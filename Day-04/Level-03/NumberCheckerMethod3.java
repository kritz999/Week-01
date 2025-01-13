import java.util.Arrays;

public class NumberCheckerMethod3 {

    // Method to find the count of digits in the number
    public static int findDigitCount(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number)); // Handle negative numbers
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to find the sum of the digits of the number
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of the digits of the number
    public static int findSumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sumOfDigits = findSumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9, 2 columns for digit and frequency
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Assign digit to the first column
            frequency[i][1] = 0; // Initialize frequency to 0
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    // Main method to test the utility
    public static void main(String[] args) {
        int number = 21; // Replace with user input if needed
        System.out.println("Number: " + number);

        // Find digit count
        int digitCount = findDigitCount(number);
        System.out.println("Digit Count: " + digitCount);

        // Store digits in array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Find the sum of digits
        int sumOfDigits = findSumOfDigits(digits);
        System.out.println("Sum of Digits: " + sumOfDigits);

        // Find the sum of squares of digits
        int sumOfSquares = findSumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find digit frequency
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) { // Print only non-zero frequencies
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
