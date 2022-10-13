package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class _340_longest_substring_with_most_K_distinct_characters {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        // Edge Case
        if (k == 0) {
            return 0;
        }
        int maxLen = 0;
        int left = 0;
        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            myMap.put(c, myMap.getOrDefault(c, 0) + 1);
            while (myMap.size() > k) {
                int count = myMap.get(s.charAt(left)) - 1;
                myMap.put(s.charAt(left), count);
                if (count == 0) {
                    myMap.remove(s.charAt(left));
                }
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
