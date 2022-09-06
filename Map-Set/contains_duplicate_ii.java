import java.util.HashMap;
import java.util.Map;

public class contains_duplicate_ii {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(nums[i])) {
                if (i - myMap.get(nums[i]) <= k) {
                    return true;
                }
            }
            myMap.put(nums[i], i);
        }
        return false;
    }
}
