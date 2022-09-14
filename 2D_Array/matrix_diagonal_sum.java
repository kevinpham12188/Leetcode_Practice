public class matrix_diagonal_sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(mat));

    }

    public static int diagonalSum(int[][] mat) {
        int sum1 = 0;
        int col = mat.length;
        int row = mat[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    sum1 += mat[i][j];
                }
            }
        }
        int sum2 = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if ((i+j) == col - 1) {
                    sum2 += mat[i][j];
                }
            }
        }
        if(col % 2 != 0) {
            return sum1 + sum2 - mat[col/2][row/2];
        } else {
            return sum1 + sum2;
        }
    }

}