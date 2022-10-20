// package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class _1358_Number_of_Substrings_Containing_All_Three_Characters {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {
        int j = 0;
        int i = 0;
        int count = 0;
        Map<Character, Integer> myMap = new HashMap<>();
        while (j < s.length()) {
            if (myMap.size() != 3) {
                if (!myMap.containsKey(s.charAt(j))) {
                    myMap.put(s.charAt(j), 1);
                }
                else {
                    myMap.put(s.charAt(j), myMap.get(s.charAt(j)) +1);
                }
            }
            while (myMap.size() == 3) {
                count += s.length() - j;
                char c = s.charAt(i);
                if (myMap.get(c) == 1){
                    myMap.remove(c);
                }
                else {
                    myMap.put(c, myMap.get(c) - 1);
                }
                i++;
            }
            j++;
        }
        return count;
    }
}
