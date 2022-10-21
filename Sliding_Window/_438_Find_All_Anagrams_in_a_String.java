package Sliding_Window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _438_Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> myList = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if (!pMap.containsKey(p.charAt(i))) {
                pMap.put(p.charAt(i), 1);
            }
            else {
                pMap.put(p.charAt(i), pMap.get(p.charAt(i))+ 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(sMap.containsKey(ch)) {
                sMap.put(ch, sMap.get(ch) + 1);
            }
            else {
                sMap.put(ch, 1);
            }

            if (i >= p.length()) {
                ch = s.charAt(i - p.length());
                if (sMap.get(ch) == 1) {
                    sMap.remove(ch);
                }
                else {
                    sMap.put(ch, sMap.get(ch) - 1);
                }
            }

            if (sMap.equals(pMap)) {
                myList.add(i - p.length() + 1);
            }
        }
        return myList;
    }
}
