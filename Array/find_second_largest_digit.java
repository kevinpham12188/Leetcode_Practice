public class find_second_largest_digit {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[] { 8, 1, 3, 2, 4 }));
    }

    // Find the largest second element in the array
    // [8, 1, 3, 2, 4] => num = 4
    public static int secondLargest(int[] arr) {
        int maxIndex = 0;
        // Find index of the max number
        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }

        // Find index of the second largest number
        int secondMaxIndex = -1;
        // initialize index = -1 instead of 0 cause the largest number might be in the
        // first position
        for (int i = 0; i < arr.length; i++) {
            if (maxIndex == i) {
                continue;
            }
            if (secondMaxIndex == -1) {
                secondMaxIndex = i;
            }
            if (arr[secondMaxIndex] < arr[i]) {
                secondMaxIndex = i;
            }
        }
        return arr[secondMaxIndex];
    }
}
