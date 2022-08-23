public class merge_2_sorted_arrays_LC {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    // You are given two integer arrays nums1 and nums2, sorted in non-
    // decreasing order, and two integers m and n, representing the
    // number of elements in nums1 and nums2 respectively.

    // Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    // The final sorted array should not be returned by the function, but instead be
    // stored inside the array nums1. To accommodate this, nums1 has a length of m +
    // n, where the first m elements denote the elements that should be merged, and
    // the last n elements are set to 0 and should be ignored. nums2 has a length of
    // n.

    // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    // Output: [1,2,2,3,5,6]
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] sortedArray = new int[m+n];
        for (int k = 0; k < sortedArray.length; k++) {
            if (i == m) {
                sortedArray[k] = nums2[j];
                j++;
                continue;
            }
            if (j == n) {
                sortedArray[k] = nums1[i];
                i++;
                continue;
            }
            if (nums1[i] < nums2[j]) {
                sortedArray[k] = nums1[i];
                i++;
            } else {
                sortedArray[k] = nums2[j];
                j++;
            }
        }
        for (int h = 0; h < sortedArray.length; h++) {
            nums1[h] = sortedArray[h];
        }
    }
}
