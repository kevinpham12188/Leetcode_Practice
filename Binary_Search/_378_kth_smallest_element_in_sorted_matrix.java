public class _378_kth_smallest_element_in_sorted_matrix {
    public static void main(String[] args) {
        int[][] myMatrix = {{1,2,3}, {3,4,5}};
        int col = myMatrix[0].length;
        System.out.println(col);
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int min = matrix[0][0];
        int max = matrix[n - 1][n - 1];
        while (min != max) {
            int mid = min + (max - min) / 2;
            int count = countNumber(matrix, mid);
            if (count < k) {
                min = mid + 1;
            }
            else {
                max = mid;
            }
        }
        return min;
    }

    public static int countNumber(int[][] matrix, int mid) {
        int count = 0;
        int column = matrix.length - 1;
        int row = 0;
        while (row < matrix.length && column >=0) {
            if (matrix[row][column] <= mid) {
                count += column + 1;
                row++;
            } else {
                column--;
            }
        }
        return count;
    }
}
