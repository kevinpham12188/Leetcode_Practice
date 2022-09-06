import java.util.HashMap;
import java.util.Map;

public class isomorphic_strings {
     public static void main(String[] args) {
        System.out.println("test");
     }

     public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> myMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (myMap.containsKey(a)) {
                if (!myMap.get(a).equals(b)) {
                    return false;
                }
            } else {
                if (!myMap.containsValue(b)) {
                    myMap.put(a, b);
                } else {
                    return false;
                }
            }
        }
        return true;
     }
}
