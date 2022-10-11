package Sliding_Window;

public class _28_find_indx_of_first_occurence_in_string {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static int strStr(String haystack, String needle) {
        // Edge case
        if (haystack == null || needle == null) {
            return -1;
        }
        // Brute force time complexity = O(n**2)
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < needle.length(); j++) {
                sb.append(haystack.charAt(i + j));
            }
            if (sb.toString().compareTo(needle) == 0) {
                return i;
            }        
        }
        // return -1;

        // Sliding window method, time complexity: O(n)
        int left = 0;
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < haystack.length(); i++) {
            myString.append(haystack.charAt(i));
            if (myString.length() > needle.length()) {
                myString.deleteCharAt(0);
                left++;
            }
            if (myString.length() == needle.length() && myString.toString().compareTo(needle) == 0) {
                return left;
            }
        }
        return -1;
    }
}
