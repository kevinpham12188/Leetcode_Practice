public class check_if_two_string_array_equivalent {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[] {"a", "cb"}, new String[] {"ab", "c"}));
    }

    // Given two string arrays word1 and word2, return true if the two arrays
    // represent the same string, and false otherwise.

    // A string is represented by an array if the array elements concatenated in
    // order forms the string.

    // Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
    // Output: true

    // Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
    // Output: false

    // Input: word1 = ["abc", "d", "defg"], word2 = ["abcddefg"]
    // Output: true

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (int i = 0; i < word1.length; i++) {
            a += word1[i];
        }
        for (int j = 0; j < word2.length; j++) {
            b += word2[j];
        }
        return a.equals(b);
    }
}
