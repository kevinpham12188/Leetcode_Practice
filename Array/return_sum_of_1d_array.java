public class return_sum_of_1d_array {
    public static void main(String[] args) {
        // System.out.println(newArray(new int[] {1,2,3,4}));
        int[] arr = newArray(new int[] {1,2,3,4});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // Running sum of 1d array
    // nums = [1, 2, 3, 4] => newArray = [1, 3, 6, 10]
    public static int[] newArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        return arr;
    }
}
