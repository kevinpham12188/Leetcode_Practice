import java.util.HashMap;
import java.util.Map;

public class subarray_sum_equals_k {
    public static void main(String[] args) {
        System.out.println("Test");
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (myMap.containsKey(sum - k)) {
                count += myMap.get(sum-k);
            }
            myMap.put(sum, myMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
