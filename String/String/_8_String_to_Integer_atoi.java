package String;

public class _8_String_to_Integer_atoi {
    public static void main(String[] args) {
        String s = " ";
        s = s.trim();
        System.out.println(s.length());
    }

    public static int myAtoi(String s) {
        // Edge case
        if (s == null) {
            return 0;
        }
        

        // Handle white spaces
        s = s.trim();

        // Handle case " " after trim, the length can be 0
        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long ans = 0;
        
        // Handle sign
        if (s.charAt(0) == '-') {
            sign = -1;
        }

        int i = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            i = 1;
        } else {
            i = 0;
        }

        while (i < s.length()) {
            if (s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) {
                break;
            }
            ans = ans * 10 + (s.charAt(i) - '0');
            // Handle Max and Min
            if (sign == -1 && ans * -1 < min) {
                return min;
            }
            if (sign == 1 && ans > max) {
                return max;
            }
            i++;
        }
        return (int)ans * sign;

    }
}
