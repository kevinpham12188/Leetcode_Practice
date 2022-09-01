import java.util.HashMap;
import java.util.Map;

public class decode_the_message {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    // You are given the strings key and message, which represent a cipher key and a
    // secret message, respectively. The steps to decode message are as follows:

    // Use the first appearance of all 26 lowercase English letters in key as the
    // order of the substitution table.
    // Align the substitution table with the regular English alphabet.
    // Each letter in message is then substituted using the table.
    // Spaces ' ' are transformed to themselves.
    // For example, given key = "happy boy" (actual key would have at least one
    // instance of each letter in the alphabet), we have the partial substitution
    // table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' ->
    // 'f').
    // Return the decoded message.

    public static String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int index = 0;
        for (char c: key.toCharArray()) {
            if (c == ' ' || map.containsKey(c)) {
                continue;
            }
            map.put(c, (char) ('a' + (index++)));
        }

        StringBuilder str = new StringBuilder();
        for (char c: message.toCharArray()) {
            if (c == ' ') {
                str.append(c);
            } else {
                str.append(map.get(c));
            }
        }
        return str.toString();
    }
}
