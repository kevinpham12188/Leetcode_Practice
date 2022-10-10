// package String;

public class reverse_string {
    public static void main(String[] args) {
        String myString = "the sky is blue";
        System.out.println(reverseWords(myString));
    }

    public static String reverseWords (String s) {
        s = s.trim();
        StringBuilder word = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else {
                if (word.isEmpty()) {
                    continue;
                }
                res.insert(0, word).insert(0, ' ');
                word = new StringBuilder();
            }
        }
        res.insert(0, word);
        return res.toString();
    }
}
