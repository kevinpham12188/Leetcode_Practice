public class array_processing {
    public static void main(String[] args) {
        System.out.println(number(new int[] {0, 1, 0, 1, 1, 0, 1, 1, 1}));
    }

    // Given an array and a number. Return the index of the frist found element in
    // the array. If not fount, return -1
    // [1,2,3,4], number = 4
    // i = 0; array[i] = 1
    // i = 1; array[i] = 2
    // i = 2; array[i] = 3
    // i = 3; array[i] = 4
    public static int returnIndex(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // Given an array with 0 and 1. Count the max consecutive 1s in the array
    // [0, 1, 0, 1, 1, 0, 1, 1, 1] => 3
    public static int number(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        } return maxCount;
    }

}
