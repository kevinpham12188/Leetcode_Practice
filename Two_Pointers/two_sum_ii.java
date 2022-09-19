public class two_sum_ii {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5,6};
        int target = 8;
        int[] newInt = twoSum(myArray, target);
        for (int i = 0; i < newInt.length; i++) {
            System.out.println(newInt[i]);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[] {left+1, right+1};
            }
        }
        return new int[] {-1, -1};
    }
}
