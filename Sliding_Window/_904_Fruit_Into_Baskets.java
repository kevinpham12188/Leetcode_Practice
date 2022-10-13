package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class _904_Fruit_Into_Baskets {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int totalFruit(int[] fruits) {
        int maxLen = 0;
        int left = 0;
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            myMap.put(fruits[i], myMap.getOrDefault(fruits[i], 0) + 1);
            while (myMap.size() > 2) {
                int count = myMap.get(fruits[left]);
                myMap.put(fruits[left], count - 1);
                if(myMap.get(fruits[left]) == 0) {
                    myMap.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
