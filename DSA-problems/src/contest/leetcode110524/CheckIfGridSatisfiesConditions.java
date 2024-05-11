package contest.leetcode110524;

public class CheckIfGridSatisfiesConditions {
    public boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i + 1 < grid.length) {
                    if (grid[i][j] != grid[i + 1][j]) {
                        return false;
                    }
                }
                if (j + 1 < grid[i].length) {
                    if (grid[i][j] == grid[i][j + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new CheckIfGridSatisfiesConditions().satisfiesConditions(new int[][]{{1}, {2},{3}}));
    }
}
