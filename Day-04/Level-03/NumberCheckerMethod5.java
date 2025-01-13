public class NumberCheckerMethod5 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numberStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method to test the utility
    public static void main(String[] args) {
        int number = 25; // Replace with user input if needed
        System.out.println("Number: " + number);

        // Check if the number is prime
        System.out.println("Is Prime: " + isPrime(number));

        // Check if the number is a neon number
        System.out.println("Is Neon: " + isNeon(number));

        // Check if the number is a spy number
        System.out.println("Is Spy: " + isSpy(number));

        // Check if the number is an automorphic number
        System.out.println("Is Automorphic: " + isAutomorphic(number));

        // Check if the number is a buzz number
        System.out.println("Is Buzz: " + isBuzz(number));
    }
}
