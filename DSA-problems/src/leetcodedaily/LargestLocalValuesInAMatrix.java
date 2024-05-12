package leetcodedaily;

public class LargestLocalValuesInAMatrix {
    public int[][] largestLocal(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] res = new int[m - 2][n - 2];
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k < i +  3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new LargestLocalValuesInAMatrix().largestLocal(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
