package Sliding_Window;

public class _209_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static int minSubArrayLen(int target, int[] nums) {
        // Edge case
        if (target == 0 || nums.length == 0) {
            return 0;
        }
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLen;
        }
    }
}
