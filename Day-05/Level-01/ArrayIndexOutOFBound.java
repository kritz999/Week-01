import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[5]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException() {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate the exception
        // generateArrayIndexOutOfBoundsException(); // Uncomment to test exception generation

        // Call method to handle the exception
        handleArrayIndexOutOfBoundsException();
    }
}
