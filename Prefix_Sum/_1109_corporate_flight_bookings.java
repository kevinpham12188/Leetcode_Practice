package Prefix_Sum;

public class _1109_corporate_flight_bookings {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int[] booking: bookings) {
            int first = booking[0];
            int last = booking[1];
            int total = booking[2];
            res[first - 1] += total;
            if (last < n) {
                res[last] -= total;
            }
        }
        for (int i = 1; i < n; i++) {
            res[i] += res[i-1];
        }
        return res;
    }
}
