package contest.leetcode270424;

public class RightTriangles {
    public long numberOfRightTriangles(int[][] grid) {
        long triangles = 0;
        int[] rowSum = new int[grid.length];
        int[] colSum = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    triangles += (rowSum[i] - 1) * (colSum[j] - 1);
                }
            }
        }
        return triangles;
    }
    public static void main(String[] args) {
        System.out.println(new RightTriangles().numberOfRightTriangles(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    }
}
