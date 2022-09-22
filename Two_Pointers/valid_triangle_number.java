import java.util.Arrays;

public class valid_triangle_number {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int triangleNumber (int[] nums) {
        int ans = 0;
        if (nums.length < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for (int i = 2; i < nums.length; i++) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    ans += right -left;
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return ans;
    }
}
