public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        //Get rows and columns length
        int rows = matrix.length;
        int columns = matrix[0].length;

        //create a new matrix, swap rows with columns
        int[][] ans = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //swap row with column position
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(transpose(matrix));
    }
}
