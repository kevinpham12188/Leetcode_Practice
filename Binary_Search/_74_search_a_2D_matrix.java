package Binary_Search;

public class _74_search_a_2D_matrix {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static boolean searchMatrix(int[][]matrix, int target) {
        // Edge case
        if (matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int lo = 0;
        int hi = rows * cols - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midpoint = matrix[mid/cols][mid%cols];
            if (target == midpoint) {
                return true;
            } else if (target < midpoint) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }
}
