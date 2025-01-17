public class RemoveCharacter {
    public static void main(String[] args) {
        // Example input
        String str = "Hello World";
        char charToRemove = 'l';

        // Remove the specific character
        String modifiedString = removeCharacter(str, charToRemove);

        // Print the result
        System.out.println("Modified String: \"" + modifiedString + "\"");
    }

    // Method to remove all occurrences of a specific character
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            if (ch != charToRemove) {
                result.append(ch); // Add characters that are not the target
            }
        }

        return result.toString();
    }
}
