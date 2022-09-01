import java.util.Arrays;

public class smallest_value_of_the_Rearranged_Number {
    public static void main(String[] args) {
        System.out.println(smallestNumber(310));
    }

    public static long smallestNumber(long num) {
        // conver number into string
        String str;
        if (num < 0) {
            long nums = num * (-1);
            str = String.valueOf(nums);
        } else {
            str = String.valueOf(num);
        }
        // split string
        char arr[] = str.toCharArray();
        long ans = 0;
        // case num < 0
        if (num < 0) {
            Arrays.sort(arr);
            for (int i = 0; i < arr.length / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
            String res = String.valueOf(arr);
            ans = Long.parseLong(res);
            ans = -ans;
        }
        // case num > 0
        if (num > 0) {
            Arrays.sort(arr);
            if (arr[0] == '0') {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] != '0') {
                        arr[0] = arr[i];
                        arr[i] = '0';
                        break;
                    }
                }
            } 
            String res = String.valueOf(arr);
            ans = Long.parseLong(res);
        }
        return ans;
    }
}
