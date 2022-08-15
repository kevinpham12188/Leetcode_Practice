public class insert_number {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(indexFound(3, new int[]{1,2,4,5}));
    }
    // Given a sorted array and a number. Insert the number to the sorted array
    // [1,2,3,4,5], number = 3 => [1,2,3,3,4,5]

    // Find the index of the number of the element less than or equal the number
    public static int indexFound(int number, int[] myArray) {
        int n = myArray.length;
        for (int i = n-1; i > 0; i--) {
            if (myArray[i] <= number) {
                return i;
            } 
        } return -1;
    }

    public static int[] newArray(int num, int[] myArray) {
        int found = indexFound(num, myArray);

        int[] myNewArray = new int[myArray.length + 1];
        if (found == -1) {
            if (num < myArray[0]) {
                myNewArray[0] = num;
                for (int i = 1; i < myNewArray.length; i++) {
                    myNewArray[i] = myArray[i-1];
                }
            }
            else {
                for (int i = 0; i < myNewArray.length-1; i++) {
                    myNewArray[i] = myArray[i];
                }
                myNewArray[myNewArray.length-1] = num;
            }
        }
        for (int i = 0; i < found; i++) {
            myNewArray[i] = myArray[i];
        }
        myNewArray[found] = num;
        for (int i = found + 1; i < myNewArray.length; i++) {
            myNewArray[i] = myArray[i - 1];
        }
        return myNewArray;
    }

}
