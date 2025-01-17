public class ReplaceWordInSentence {
    public static void main(String[] args) {
        // Example input
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String wordToReplace = "fox";
        String replacementWord = "cat";

        // Call the replace method
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Print the result
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Use the replaceAll method with word boundaries to replace only full words
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}
