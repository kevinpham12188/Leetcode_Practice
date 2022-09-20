import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum {
    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            if (i == 0 || nums[i] != nums[i-1]) {
                while (start < end) {
                    int sum = nums[i] + nums[start] + nums[end];
                    if (sum == 0) {
                        finalList.add(Arrays.asList(nums[i], nums[start], nums[end]));
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end-1]) {
                            end--;
                        }
                        start++;
                        end--;
                    }
                    else if (sum < 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return finalList;
    }
}
