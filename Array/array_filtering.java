public class array_filtering {
    public static void main(String[] args) {
        System.out.println(newArray(3, new int[]{1,2,3,4,3}));

    }

    // Given an array and a number. Remove the first element found in the array.
    // Return the new array
    // [1,2,3,4,3], number = 3 => newArray = [1, 2, 4, 3]

    public static int findIndex(int number, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                return i;
            }
        } return -1;
    }

    public static int[] newArray(int number, int[] myArray) {
        int found = findIndex(number, myArray);

        for (int i = found; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i+1];
        }
        return myArray;
    }
}
