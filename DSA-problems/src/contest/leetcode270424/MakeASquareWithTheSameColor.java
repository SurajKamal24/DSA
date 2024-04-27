package contest.leetcode270424;

public class MakeASquareWithTheSameColor {
    public boolean canMakeSquare(char[][] grid) {
        int whiteCount = 0, blackCount = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j< 2; j++) {
                if (grid[i][j] == 'W') {
                    whiteCount++;
                } else {
                    blackCount++;
                }
                if (grid[i][j + 1] == 'W') {
                    whiteCount++;
                } else {
                    blackCount++;
                }
                if (grid[i + 1][j] == 'W') {
                    whiteCount++;
                } else {
                    blackCount++;
                }
                if (grid[i + 1][j + 1] == 'W') {
                    whiteCount++;
                } else {
                    blackCount++;
                }
                if (whiteCount == 4 || blackCount == 4 || (whiteCount == 3 && blackCount == 1) || (whiteCount == 1 && blackCount == 3)) {
                    return true;
                }
                whiteCount = 0;
                blackCount = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new MakeASquareWithTheSameColor().canMakeSquare(new char[][]{{'B', 'W', 'B'}, {'B', 'W', 'W'}, {'B', 'W', 'B'}}));
    }
}
