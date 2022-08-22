public class maximum_number_of_words_found_in_sentences {
    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is greate thanks very much"}));
    }

    // A sentence is a list of words that are separated by a single space with no
    // leading or trailing spaces
    // Given an array of strings sentences, where each sentence[i] represents a
    // single sentence
    // Return the maximum number of words that appear in a single sentence
    // Input: sentences = ["alice and bob love leetcode", "i think so too", "this is
    // greate thanks very much"]
    // Output: 6

    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            // Split each element in to a list
            String[] words = sentences[i].split(" ");
            count = words.length;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
