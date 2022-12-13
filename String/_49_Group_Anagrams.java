import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_Group_Anagrams {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }

        Map<String, List> myMap = new HashMap<>();
        for (String s: strs) {
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String key = String.valueOf(array);
            if (!myMap.containsKey(key)) {
                myMap.put(key, new ArrayList<>());
            }
            myMap.get(key).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
}
