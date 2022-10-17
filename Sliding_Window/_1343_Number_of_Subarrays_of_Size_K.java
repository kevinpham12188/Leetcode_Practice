// package Sliding_Window;

public class _1343_Number_of_Subarrays_of_Size_K {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < arr.length) {
            sum += arr[j];
            if(j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {
                int avg = sum/k;
                if (avg >= threshold) {
                    count++;
                }
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return sum;
    }
}
