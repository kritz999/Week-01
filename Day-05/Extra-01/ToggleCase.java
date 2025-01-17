public class ToggleCase {
    public static void main(String[] args) {
        // Example input
        String input = "Hello World!";

        // Toggle the case of each character
        String toggledString = toggleCase(input);

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("Toggled String: " + toggledString);
    }

    // Method to toggle the case of each character
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } 
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } 
            // If it's neither (e.g., a digit or symbol), append it as is
            else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
