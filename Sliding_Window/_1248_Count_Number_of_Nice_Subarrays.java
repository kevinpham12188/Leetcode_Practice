package Sliding_Window;


public class _1248_Count_Number_of_Nice_Subarrays {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        // Edge case
        if (nums.length == 0 || k == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int odd_count = 0;
        int count = 0;
        int res = 0;
        while (j < nums.length) {
            if (nums[j] % 2 != 0) {
                odd_count++;
                count = 0;
            }
            while (odd_count == k) {
                count++;
                if (nums[i] % 2 != 0) {
                    odd_count--;
                }
                i++;
            }
            res += count;
            j++;
        }
        return res;
    }
}
