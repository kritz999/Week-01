public class LexicographicalComparison {
    public static void main(String[] args) {
        // Example input
        String str1 = "apple";
        String str2 = "banana";

        // Perform lexicographical comparison
        int result = compareStrings(str1, str2);

        // Print the result
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal.");
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLength = Math.min(len1, len2);

        // Compare each character
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; // Return the difference of the characters
            }
        }

        // If all characters are equal, compare lengths
        return len1 - len2;
    }
}
