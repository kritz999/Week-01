public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException() {
        String text = "abc123";
        int number = Integer.parseInt(text); // This will throw NumberFormatException
        System.out.println(number);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException() {
        String text = "abc123";
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate the exception
        // generateNumberFormatException(); // Uncomment to test exception generation

        // Call method to handle the exception
        handleNumberFormatException();
    }
}
