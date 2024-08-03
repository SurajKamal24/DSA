package contest.biweeklycontest136;

public class MinimumNumberOfFlipsToMakeBinaryGridPalindromicI {
    public int minFlips(int[][] grid) {
        int rowCount = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int k = 0; k < m; k++) {
            int i = 0, j = n - 1;
            int count = 0;
            while (i < j) {
                if (grid[k][i] != grid[k][j]) {
                    count++;
                }
                i++;
                j--;
            }
            rowCount += count;
        }
        int colCount = 0;
        for (int k = 0; k < n; k++) {
            int i = 0, j = m - 1;
            int count = 0;
            while (i < j) {
                if (grid[i][k] != grid[j][k]) {
                    count++;
                }
                i++;
                j--;
            }
            colCount += count;
        }
        return Math.min(rowCount,colCount);
    }

    public static void main(String[] args) {
        //System.out.println(new MinimumNumberOfFlipsToMakeBinaryGridPalindromicI().minFlips(new int[][] {{1,0,0}, {0,0,0}, {0,0,1}}));
        System.out.println(new MinimumNumberOfFlipsToMakeBinaryGridPalindromicI().minFlips(new int[][] {{0, 1}, {0, 1}, {0, 0}}));
    }
}
