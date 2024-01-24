package arrays;

public class SumsOfRowAndColumn {
    static int sumOfRowCol(int N, int M, int A[][]) {
        // code here
        int valid = Math.min(N, M);
        System.out.println("valid is " + valid);
        for (int i = 0; i < valid; i++) {
            int rowSum = 0;
            for (int j = 0; j < N; j++) {
                System.out.println(i + " " + j);
                rowSum += A[i][j];
            }
            System.out.println("row done");
            int colSum = 0;
            for (int j = 0; j < M; j++) {
                System.out.println(i + " " + j);
                colSum += A[j][i];
            }
            System.out.println("column done");
            if (rowSum != colSum)
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int[][] A = {{5},{0},{0}};
        System.out.println(sumOfRowCol(1,3,A));
    }
}
