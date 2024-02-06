package arrays;

public class PrintMatrixInDiagonalPattern {
    public static int[] matrixDiagonally(int[][] mat) {
       int m = mat.length;
       int n = mat[0].length;
       int[] arr = new int[m * n];
       int i = 0;
       int row = 0, col = 0;
       boolean up = true;
        while (row < m && col < n) {
            if (up) {
                while (row > 0 && col < n - 1) {
                    arr[i] = mat[row][col];
                    i++;
                    row--;
                    col++;
                }
                arr[i] = mat[row][col];
                i++;
                if (col == n-1){
                    row++;
                } else {
                    col++;
                }
            } else {
                while (col > 0 && row < m-1) {
                    arr[i] = mat[row][col];
                    i++;
                    row++;
                    col--;
                }
                arr[i] = mat[row][col];
                i++;
                if (row == m -1) {
                    col++;
                } else {
                    row++;
                }
            }
            up = !up;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int num : matrixDiagonally(mat)) {
            System.out.print(num + " ");
        }
    }
}
