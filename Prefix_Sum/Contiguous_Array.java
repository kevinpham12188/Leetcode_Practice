package Prefix_Sum;

import java.util.HashMap;
import java.util.Map;

public class Contiguous_Array {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int findMaxLength(int[] nums) {
        int max_length = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(0, -1);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count+= -1;
            } else {
                count += 1;
            }
            if (myMap.containsKey(count)) {
                max_length = Math.max(max_length, i - myMap.get(count));
            } else {
                myMap.put(count, i);
            }
        }
        return max_length;
    }
}
