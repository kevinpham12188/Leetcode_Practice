import java.util.HashSet;
import java.util.Set;

public class number_of_arithmetic_triplets {
    public static void main(String[] args) {
        System.out.println("test");
    }
    public static int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> mySet = new HashSet<>();
        int count = 0;
        for (int num : nums) {
            if (mySet.contains(num - diff) && mySet.contains(num-diff*2)) {
                count++;
            }
            mySet.add(num);
        }
        return count;
    }
}
