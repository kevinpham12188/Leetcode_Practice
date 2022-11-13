public class _14_Longest_Common_Prefix {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static String longestCommonPrefex(String[] strs) {
        // return empty string if string length == 0
        if (strs.length == 0) {
            return "";
        }

        int len = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            len = Math.min(len, strs[i].length());
            for (int j = 0; j < len; j++) {
                char c = strs[0].charAt(j);
                char d = strs[i].charAt(j);
                if (c != d) {
                    len = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, len);
    }
}
