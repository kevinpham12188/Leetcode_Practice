public class remove_element {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3, 2, 2, 3}, 3));
    }

    // nums = [3, 2, 2, 3], val = 3 => 2, nums = [2, 2, _, _]
    public static int removeElement(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                for (int j = i; j < n-1; j++) {
                    arr[j] = arr[j+1];
                }
                i--;
                n--;
            }
        }
        return n;
    }
}
