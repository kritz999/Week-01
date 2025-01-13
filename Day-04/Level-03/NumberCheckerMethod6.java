import java.util.ArrayList;

public class NumberCheckerMethod6 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        factorsList.add(number);  // The number is also a factor of itself
        int[] factors = new int[factorsList.size()];
        for (int i = 0; i < factorsList.size(); i++) {
            factors[i] = factorsList.get(i);
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        int maxFactor = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > maxFactor) {
                maxFactor = factor;
            }
        }
        return maxFactor;
    }

    // Method to find the sum of the factors using the factors array and return the sum
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array and return the product
    public static long productOfFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Helper method to find factorial of a number
    private static int factorial(int n) {
        if (n == 0) return 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        int number = 28; // You can change this number for testing
        System.out.println("Number: " + number);

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        System.out.println("Greatest Factor: " + greatestFactor(number));

        // Find the sum of the factors
        System.out.println("Sum of Factors: " + sumOfFactors(number));

        // Find the product of the factors
        System.out.println("Product of Factors: " + productOfFactors(number));

        // Find the product of the cube of the factors
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));

        // Check if the number is a perfect number
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));

        // Check if the number is an abundant number
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));

        // Check if the number is a deficient number
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));

        // Check if the number is a strong number
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
