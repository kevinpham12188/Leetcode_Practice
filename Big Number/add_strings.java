
public class add_strings {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        StringBuilder myStringBuilder = new StringBuilder();
        int carry = 0;
        while (i >=0 || j >= 0) {
            int digit1;
            if (i >= 0) {
                digit1 = num1.charAt(i) - '0';
            } else {
                digit1 = 0;
            }
            
            int digit2;
            if (j >= 0) {
                digit2 = num2.charAt(j) - '0';
            } else {
                digit2 = 0;
            }

            int sum = digit1 + digit2 + carry;

            myStringBuilder.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }

        if (carry == 1) {
            myStringBuilder.append(1);
        }
        return myStringBuilder.reverse().toString();

    }
}
