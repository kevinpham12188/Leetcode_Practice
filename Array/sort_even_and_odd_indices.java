import java.util.Arrays;
// import java.util.Collections;

public class sort_even_and_odd_indices {
    public static void main(String[] args) {
        int[] sortedEven = sortEvenOdd2(new int[] { 4, 1, 2, 3 });
        for (int i = 0; i < sortedEven.length; i++) {
            System.out.println(sortedEven[i]);
        }
    }

    // You are given a 0-indexed integer array nums. Rearrange the values of nums
    // according to the following rules:

    // Sort the values at odd indices of nums in non-increasing order.
    // For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1]
    // after. The values at odd indices 1 and 3 are sorted in non-increasing order.

    // Sort the values at even indices of nums in non-decreasing order.
    // For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3]
    // after. The values at even indices 0 and 2 are sorted in non-decreasing order.

    // Return the array formed after rearranging the values of nums.

    public static int[] sortEvenOdd(int[] nums) {
        int swap;
        // Iterate through even indices
        for (int i = 0; i < nums.length - 2; i = i + 2) {
            if (i % 2 == 0) {
                swap = nums[i];
                nums[i] = nums[i + 2];
                nums[i + 2] = swap;
            }
        }
        // Iterate through odd indices
        for (int j = 1; j < nums.length - 2; j = j + 2) {
            if (j % 2 != 0) {
                swap = nums[j];
                nums[j] = nums[j + 2];
                nums[j + 2] = swap;
            }
        }
        return nums;
    }

    public static int[] sortEvenOdd2(int[] nums) {
        int[] even;
        int[] odd;
        if (nums.length % 2 != 0) {
            even = new int[nums.length / 2 + nums.length % 2];
            odd = new int[nums.length / 2];
        } else {
            even = new int[nums.length / 2];
            odd = new int[nums.length / 2];
        }
        int k = 0;
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[k] = nums[i];
                k++;
            } else {
                odd[f] = nums[i];
                f++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int o = 0;
        int m = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even[o];
                o++;
            }
        }
        for (int i = odd.length - 1; i >= 0; i--) {
            nums[m] = odd[i];
            m = m + 2;
        }
        return nums;
    }
}
