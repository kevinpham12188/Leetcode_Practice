public class _6_Zigzag_Conversion {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static String convert(String s, int numRows) {
        // Edge case
        if (numRows == 1) {
            return s;
        }
        // Define StringBuilders to store the small strings
        StringBuilder[] myString = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            myString[i] = new StringBuilder();
        }

        // Define variables
        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;

        while (index < n) {
            // Going down
            for (int i = 0; i < numRows && index < n; i++) {
                myString[i].append(arr[index]);
                index++;
            }

            // Going up
            for (int i = numRows - 2; i > 0 && index < n; i--) {
                myString[i].append(arr[index]);
                index++;
            }
        }

        // Append all small strings into one strings
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            res.append(myString[i]);
        }
        return res.toString();
    }
}
