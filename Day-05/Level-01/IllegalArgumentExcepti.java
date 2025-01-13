public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException() {
        String text = "Hello";
        System.out.println(text.substring(3, 1)); // This will throw IllegalArgumentException
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException() {
        String text = "Hello";
        try {
            System.out.println(text.substring(3, 1));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate the exception
        // generateIllegalArgumentException(); // Uncomment to test exception generation

        // Call method to handle the exception
        handleIllegalArgumentException();
    }
}
