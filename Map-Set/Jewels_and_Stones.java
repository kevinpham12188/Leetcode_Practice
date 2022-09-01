import java.util.HashSet;
import java.util.Set;

public class Jewels_and_Stones {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char arr[] = jewels.toCharArray();
        Set<Character> jewelsSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            jewelsSet.add(arr[i]);
        }
        char arr2[] = stones.toCharArray();
        int count = 0;
        for (int j = 0; j < arr2.length; j++) {
            if (jewelsSet.contains(arr2[j])) {
                count++;
            }
        }
        return count;
    }
}
