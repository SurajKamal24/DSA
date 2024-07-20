package leetcodedaily;

public class FindValidMatrixGivenRowAndColumnSums {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] matrix = new int[rowSum.length][colSum.length];
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                matrix[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= matrix[i][j];
                colSum[j] -= matrix[i][j];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(new FindValidMatrixGivenRowAndColumnSums().restoreMatrix(new int[]{5, 7, 10}, new int[]{8, 6, 8}));
    }

}
