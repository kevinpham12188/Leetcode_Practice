// package Sliding_Window;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1456_Maximum_Number_of_Vowels_in_Substring_of_Given_Length {
    public static void main(String[] args) {
        String myString = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
        int k = 33;
        System.out.println(maxVowels(myString, k));
        System.out.println(myString.length());
    }

    public static int maxVowels(String s, int k) {
    //    Edge case
        if (s.length() == 0 || k > s.length()) {
            return 0;
        }
        List<Character> myList = Arrays.asList('a', 'e', 'i', 'o', 'u');
        Set<Character> vowels = new HashSet<Character>(myList);
        int count = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        max = count;
        // return count;
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
            if (vowels.contains(s.charAt(i-k))) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
