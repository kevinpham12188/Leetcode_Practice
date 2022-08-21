public class duplicate_zeroes {
    public static void main(String[] args) {
        int [] myArray = newArray(new int[] {1,0,2,3,0,4,5,0});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
    // Duplicate zeroes
    // nums = [1,0,2,3,0,4,5,0] => nums = [1,0,0,2,3,0,0,4]
    public static int[] newArray (int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        return arr;
    }
}
