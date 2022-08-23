public class merged_2_sorted_array {
    public static void main(String[] args) {
        int[] myArray = mySortedArray(new int[] {1,2,3}, new int[] {2,5,6});
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    // Given 2 sorted arrays. Return the new combination sorted array from the two
    // Input: 
    // [1,4,5]
    // [2,9]
    // Output: [1, 2, 4, 5, 9]
    public static int[] mySortedArray (int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int[] sortedArray = new int[arr1.length + arr2.length];
        for (int k = 0; k < sortedArray.length; k++) {
            // If arr1 does not have any elements => new array will have arr2 elements
            if (i == arr1.length) {
                sortedArray[k] = arr2[j];
                j++;
                continue;
            }
            // If arr2 does not have any elements => new array will have arr1 elements
            if (j == arr2.length) {
                sortedArray[k] = arr2[i];
                i++;
                continue; 
            }
            // If both arrays have elements
            if (arr1[i] < arr2[j]) {
                sortedArray[k] = arr1[i];
                i++;
            }
            else {
                sortedArray[k] = arr2[j];
                j++;
            }
        }
        return sortedArray;
    }
}
