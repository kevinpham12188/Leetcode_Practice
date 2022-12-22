package Binary_Search;

public class _278_first_bad_version {
    public static void main(String[] args) {
        System.out.println((4+5)/2);
    }

    public static int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid) == true) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
