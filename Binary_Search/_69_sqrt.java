package Binary_Search;

public class _69_sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }
    public static int mySqrt(int x) {
        int lo = 0;
        // The square root of every number will never be greater than itself divided by 2
        int hi = x / 2; 
        int ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if (mid * mid < x) {
                ans = mid;
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
