import java.util.HashMap;
import java.util.Map;

public class valid_anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram(new String("anagram"), new String("nagaram")));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> myMap = new HashMap<>();
        Map<Character, Integer> myMap1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (myMap.containsKey(a)) {
                myMap.put(a, myMap.get(a) + 1);
            } else {
                myMap.put(a, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char b = t.charAt(i);
            if (myMap1.containsKey(b)) {
                myMap1.put(b, myMap1.get(b) + 1);
            } else {
                myMap1.put(b, 1);
            }
        }
        return myMap.equals(myMap1);

    }
}
