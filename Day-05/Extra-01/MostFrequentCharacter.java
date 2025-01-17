public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Example input
        String str = "success";

        // Find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(str);

        // Print the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256]; // Array to store the frequency of each character (ASCII size)

        // Count the frequency of each character
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        // Find the character with the highest frequency
        char mostFrequentChar = '\0';
        int maxFrequency = 0;

        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxFrequency) {
                maxFrequency = freq[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }
}
