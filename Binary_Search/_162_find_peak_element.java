public class _162_find_peak_element {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 1, 2};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid + 1]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}