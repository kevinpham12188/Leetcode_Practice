package Prefix_Sum;

import java.util.HashMap;
import java.util.Map;

public class Subarray_sum_divisible_by_k {
    public static void main(String[] args) {
        int num = subarraysDivByK(new int[] {5,5}, 5);
        System.out.println(num);
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, 1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            if (remainderMap.containsKey(rem)) {
                ans+=remainderMap.get(rem);
                remainderMap.put(rem, remainderMap.get(rem) + 1);
            } else {
                remainderMap.put(rem, 1);
            }
        }
        return ans;
    }
}
