import java.util.HashMap;
import java.util.Map;

public class sum_of_unique_elements {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (myMap.containsKey(key)) {
                int count = myMap.get(key);
                count++;
                myMap.put(key, count);
            } else {
                myMap.put(key, 1);
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (myMap.get(nums[i]) == 1) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
