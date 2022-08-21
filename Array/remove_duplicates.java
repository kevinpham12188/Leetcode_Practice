public class remove_duplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 1, 2 }));
    }

    // Remove duplicate element in array
    // nums = [1,1,2] => 2, [1,2]
    public static int removeDuplicates(int[] arr) {
        int n = 0;
        int[] myArray = new int[arr.length];
        myArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (myArray[n] != arr[i]) {
                myArray[n+1] = arr[i];
                n++;
            }
        } return n+1;
    }
}
