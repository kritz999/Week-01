public class StringIndexOutOfBoundsExceptionDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException() {
        String text = "Hello";
        System.out.println(text.charAt(10)); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException() {
        String text = "Hello";
        try {
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate the exception
        // generateStringIndexOutOfBoundsException(); // Uncomment to test exception generation

        // Call method to handle the exception
        handleStringIndexOutOfBoundsException();
    }
}
