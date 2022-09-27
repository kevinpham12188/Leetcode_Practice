package Prefix_Sum;


public class product_of_array_except_self {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] output = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        // adding elements to left
        // nums = [1,2,3,4]
        // i = 1 => left[1] = nums[0] * left[0] = 1*1 = 1
        // i = 2 => left[2] = nums[1] * left[1] = 2 * 1 = 2
        // i = 3 => left[3] = nums[2] * left[2] = 3 * 2 = 6
        // left = {1, 1, 2, 6}
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i-1] * left[i-1];
        }

        // adding elements to right
        // i = 2 => right[2] = nums[3] * right[3] = 4*1 = 4
        // i = 1 => right[1] = nums[2] * right[2] = 3 * 4 = 12
        // i = 0 => right[0] = nums[1] * right[1] = 2 * 12 = 24
        // right = {24, 12, 4, 1}
        for (int i = n - 2; i >=0; i--) {
            right[i] = nums[i+1] * right[i+1];
        }

        // adding elements to final array
        for (int i = 0; i < n; i++) {
            output[i] = left[i] * right[i];
        }
        return output;
    }
}
