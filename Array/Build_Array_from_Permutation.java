public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        System.out.println("test");
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
