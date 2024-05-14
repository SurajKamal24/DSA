package leetcodedaily;

import java.util.Map;

public class PathWithMaximumGold {
    private int dfs (int[][] grid, int i , int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        int currentGold = grid[i][j];
        grid[i][j] = 0;
        int up = dfs(grid, i - 1, j);
        int down = dfs(grid, i + 1, j);
        int right = dfs(grid, i, j + 1);
        int left = dfs(grid, i, j - 1);
        grid[i][j] = currentGold;
        return currentGold + Math.max(Math.max(up, down), Math.max(right, left));
    }
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                maxGold = Math.max(maxGold, dfs(grid, i, j));
            }
        }
        return maxGold;
    }
    public static void main(String[] args) {
        System.out.println(new PathWithMaximumGold().getMaximumGold(new int[][]{{0,6,0},{5,8,7},{0,9,0}}));
    }
}
