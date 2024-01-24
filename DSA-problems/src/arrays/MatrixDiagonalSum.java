package arrays;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
//        int sum = 0;
//        for (int i = 0; i < mat.length; i++) {
//            sum += mat[i][i];
//        }
//
//        for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
//            if (i !=j)
//                sum += mat[i][j];
//        }
//        return sum;
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j || i + j == mat.length - 1) {
                    ans += mat[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        System.out.println(diagonalSum(mat));
    }
}
