package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixIII {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        int totalCells = rows * cols;
        List<int[]> result = new ArrayList<>();
        int r = rStart, c = cStart;
        int steps = 1;
        outerloop:
        while (result.size() < totalCells) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < steps; j++) {
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result.add(new int[]{r, c});
                    }
                    if (result.size() == totalCells) {
                        break outerloop;
                    }
                    r += directions[d][0];
                    c += directions[d][1];
                }
                d = (d + 1) % 4;
            }
            steps++;
        }
        int res[][] = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        SpiralMatrixIII spiralMatrixIII = new SpiralMatrixIII();
        int[][] res = spiralMatrixIII.spiralMatrixIII(5, 6, 1, 4);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " " + res[i][1]);
        }
    }
}
