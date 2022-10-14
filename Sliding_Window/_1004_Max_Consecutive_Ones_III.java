package Sliding_Window;

public class _1004_Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int longestOnes(int[] nums, int k) {
        int result = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k--;
            }
            while (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
            result = Math.max(result, i - left + 1);
        }
        return result;
    }
}
