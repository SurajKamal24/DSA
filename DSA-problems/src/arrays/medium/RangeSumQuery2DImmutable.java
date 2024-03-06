package arrays.medium;

//https://leetcode.com/problems/range-sum-query-2d-immutable/description/

public class RangeSumQuery2DImmutable {

    int[][] preArr = new int[200][200];
    public RangeSumQuery2DImmutable(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    preArr[i][j] = matrix[i][j];
                } else if (i == 0) {
                    preArr[i][j] = preArr[i][j-1] + matrix[i][j];
                } else if (j == 0) {
                    preArr[i][j] = preArr[i-1][j] + matrix[i][j];
                } else {
                    preArr[i][j] = preArr[i][j-1] + preArr[i-1][j] - preArr[i-1][j-1] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = preArr[row2][col2];
        if (row1 > 0) ans -= preArr[row1-1][col2];
        if (col1 > 0) ans -= preArr[row2][col1-1];
        if (row1 > 0 && col1 > 0) ans += preArr[row1-1][col1-1];
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        RangeSumQuery2DImmutable r = new RangeSumQuery2DImmutable(matrix);
        System.out.println(r.sumRegion(2, 1, 4, 3));

    }

}
