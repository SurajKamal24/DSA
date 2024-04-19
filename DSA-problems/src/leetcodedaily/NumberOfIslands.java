package leetcodedaily;

public class NumberOfIslands {

    void bfs(char[][] grid, int i, int j) {
        grid[i][j] = '*';
        if (i > 0 && grid[i - 1][j] == '1') {
            bfs(grid, i - 1, j);
        }
        if (i < grid.length - 1 && grid[i + 1][j] == '1') {
            bfs(grid, i + 1, j);
        }
        if (j > 0 && grid[i][j - 1] == '1') {
            bfs(grid, i, j - 1);
        }
        if (j < grid[i].length - 1 && grid[i][j + 1] == '1') {
            bfs(grid, i, j + 1);
        }
    }
    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    public static void main(String[] args) {
        NumberOfIslands n = new NumberOfIslands();
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        System.out.println(n.numIslands(grid));
    }
}
