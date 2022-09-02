import java.util.HashSet;
import java.util.Set;

public class first_letter_to_appear_twice {
    public static void main(String[] args) {
        System.out.println(repeatedCharater(new String("aasll")));
    }
    public static char repeatedCharater(String s) {
        char[] arr = s.toCharArray();
        Set<Character> mySet = new HashSet<>();
        char a = ' ';
        for (int i = 0; i < arr.length; i++) {
            if (mySet.contains(arr[i])) {
                a = arr[i];
                return a;
            } else {
                mySet.add(arr[i]);
            }
        }
        return a;
    }
}
