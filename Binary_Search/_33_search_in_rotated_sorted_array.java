// package Binary_Search;

public class _33_search_in_rotated_sorted_array {
    public static void main(String[] args) {
        System.out.println(2%4);
    }

    public static int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[lo] <= nums[mid]) {
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                }
                else {
                    lo = mid + 1;
                }
            }
            else {
                if (target <= nums[hi] && target > nums[mid]) {
                    lo = mid + 1;
                }
                else {
                    hi = mid -1;
                }
            }
        }
        return -1;
    }
}
