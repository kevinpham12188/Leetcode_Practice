public class multiply_strings {
    public static void main(String[] args) {
        String a = "12";
        String b = "12";
        String myString = multiply(a, b);
        System.out.println(myString);
    }

    public static String multiply(String num1, String num2) {
        // One of the number is 0 => result = 0
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        // Multiply each num of num1 to each num of num2 and add to int array
        int[] res = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >=0; j--) {
                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';

                res[i + j] += n1 * n2;
            }
        }

        // Caculate mod and carry by adding each element of array
        int product = 0;
        int carry = 0;
        StringBuilder myRestul = new StringBuilder();
        for (int i = res.length - 1; i >=0; i--) {
            product = (res[i] + carry) % 10;
            carry = (res[i] + carry) / 10;

            if (i == res.length - 1 && res[i] == 0) {
                continue;
            }
            myRestul.append(product);
        }
        if (carry != 0) {
            myRestul.append(carry);
        }
        return myRestul.reverse().toString();
    }
}
