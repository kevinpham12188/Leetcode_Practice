
public class plus_one {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] plusOne = new int[n+1];
        plusOne[0] = 1;
        return plusOne;

        // This solution is not good because of long type

        // StringBuilder myStringBuilder = new StringBuilder();
        // for (int i: digits) {
        //     myStringBuilder.append(i);
        // }
        // String myString = myStringBuilder.toString();
        // int num = Integer.parseInt(myString) + 1;
        // String temp = Integer.toString(num);
        // int[] plusOne = new int[temp.length()];
        // for (int i = 0; i < temp.length(); i++) {
        //     plusOne[i] = temp.charAt(i) - '0';
        // }
        // return plusOne;
    }
}
