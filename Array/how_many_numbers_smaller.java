public class how_many_numbers_smaller {
    public static void main(String[] args) {
        int[] myArray = smallerNumbersThanCurrent(new int[] {8,1,2,2,3});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    // Given the array nums, for each nums[i] find out how many numbers in the array
    // are smaller than it. That is, for each nums[i] you have to count the number
    // of valid j's such that j != i and nums[j] < nums[i].

    // Return the answer in an array.

    // Input: nums = [8,1,2,2,3]
    // Output: [4,0,1,1,3]

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            newArray[i] = count;
        }
        return newArray;
    }
}
