import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class intersection_of_two_array_ii {
    public static void main(String[] args) {
        System.out.println("Test");
    }
    
    public static int[] intersect (int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> hm1 = new HashMap<>();
        Map<Integer, Integer> hm2 = new HashMap<>();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (hm1.containsKey(nums1[i])) {
                hm1.put(nums1[i], hm1.get(nums1[i]) + 1);
            } else {
                hm1.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hm2.containsKey(nums2[i])) {
                hm2.put(nums2[i], hm2.get(nums2[i]) + 1);
            } else {
                hm2.put(nums2[i], 1);
            }
        }

        for (Integer key: hm1.keySet()) {
            if (hm2.containsKey(key)) {
                int count = Math.min(hm2.get(key), hm1.get(key));
                while(count-- > 0) {
                    arr.add(key);
                }
            }
        }

        int res[] = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;

    }
}
