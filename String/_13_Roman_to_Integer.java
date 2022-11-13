import java.util.HashMap;
import java.util.Map;

public class _13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        int sum = myMap.get(s.charAt(s.length()-1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (myMap.get(s.charAt(i)) < myMap.get(s.charAt(i+1))) {
                sum -= myMap.get(s.charAt(i));
            } else {
                sum += myMap.get(s.charAt(i));
            }
        }
        return sum;
    }
}
