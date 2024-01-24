package arrays;

public class PrintMatrixInDiagonalPattern {
    public static int[] matrixDiagonally(int[][] mat) {
       return null;
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int num : matrixDiagonally(mat)) {
            System.out.println(num + " ");
        }
    }
}
