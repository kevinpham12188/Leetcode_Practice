
import java.util.HashMap;
import java.util.Map;

public class Contiguous_Array_Sum {
    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[] {1,1,3}, 3));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        // Create HashMap to store remainder and its index
        Map<Integer, Integer> myMap = new HashMap<>();
        // Edge case if the whole array is subarray
        myMap.put(0, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k!=0) {
                sum = sum % k;
            }
            if (myMap.containsKey(sum)) {
                if (i - myMap.get(sum) >= 2) {
                    return true;
                }
            } else {
                myMap.put(sum, i);
            }
        }
        return false;
    }
}
