public class concatenation_of_array {
    public static void main(String[] args) {
        int[] concatenatedArray = getConcatenation(new int[] {1,2,1});
        for (int i = 0; i < concatenatedArray.length; i++) {
            System.out.println(concatenatedArray[i]);
        }
    }

    // Given an integer array of length n, create an array of length 2n where ans[i]
    // == nums[i] and ans[i+n] == nums[i]
    // Input: nums = [1,2,1]
    // Output: [1,2,1,1,2,1]

    // n = 3
    // i = 0 => [1, _, _, 1, _, _]
    // i = 1 => [1, 2, _, 1, 2, _]
    // i = 2 => [1, 2, 1, 1, 2, 1]
    public static int[] getConcatenation(int[] arr) {
        int n = arr.length;
        int[] newArray = new int[n*2];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
            newArray[i+n] = arr[i];
        }
        return newArray;
    }
}
