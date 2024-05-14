package leetcodedaily;

public class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[i].length; j++) {
                    grid[i][j] = grid[i][j] == 0 ? 1 : 0;
                }
            }
        }
        for (int j = 1; j < grid[0].length; j++) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
            if (count > grid.length / 2) {
                for (int i = 0; i < grid.length; i++) {
                    grid[i][j] = grid[i][j] == 0 ? 1 : 0;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            int row = 0;
            for (int j = 0; j < grid[i].length; j++) {
                row = row * 2 + grid[i][j];
            }
            sum += row;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(new ScoreAfterFlippingMatrix().matrixScore(new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}}));
    }
}
