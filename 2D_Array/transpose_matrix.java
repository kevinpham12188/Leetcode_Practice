public class transpose_matrix {
    public static void main(String[] args) {
        System.out.println("test");
    }

    public static int[][] transpose(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        int [][] tranpose = new int[row][col];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                tranpose[j][i] = matrix[i][j];
            }
        }
        return tranpose;
    }
}
