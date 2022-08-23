import java.util.Arrays;

public class square_of_an_array {
    public static void main(String[] args) {
        System.out.println(sortedSquares(new int[] {-4,-1,0,3,10}));
    }

    // Given an integer array nums sorted in non-decreasing order, return an array
    // of the squares of each number sorted in non-decreasing order.

    // Input: nums = [-4,-1,0,3,10]
    // Output: [0,1,9,16,100]

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]* nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
