import java.util.HashMap;
import java.util.Map;

// package Sliding_Window;

public class _567_permutation_in_string {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static boolean checkInclusion(String s1, String s2) {
        // Edge Case
        if (s1.length() > s2.length()) {
            return false;
        }

        // Put all characters in s1 to a map

        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            myMap.put(s1.charAt(i), myMap.getOrDefault(s1.charAt(i), 0) + 1);
        }

        // Set 2 pointers and methods for sliding windows
        int left = 0;
        for (int i = 0; i <= s2.length(); i++) {
            if (i - left > s1.length()) {
                left++;
            } else if (i - left < s1.length()) {
                continue;
            }

            if (isPermutation(myMap, s2.substring(left, i))) {
                return true;
            }
        }
        return false;
    }
    // Create another method assess permutation
    public static boolean isPermutation(Map<Character, Integer> map, String s) {
        // Add all characters of String s to a map
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (myMap.size() != map.size()) {
            return false;
        }
        for (char c : map.keySet()) {
            if (!myMap.containsKey(c) || !map.equals(myMap)) {
                return false;
            }
        }
        return true;
    }
}
