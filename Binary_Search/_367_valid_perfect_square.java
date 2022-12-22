package Binary_Search;

public class _367_valid_perfect_square {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static boolean isPerfectSquare(int num) {
        // Edge case
        if (num == 1) {
            return true;
        }

        int lo = 0;
        int hi = num / 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long a = (long) mid * mid;
            if (a == num) {
                return true;
            } else if (a < num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
