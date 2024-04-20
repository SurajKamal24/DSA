package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class FindAllGroupsOfFarmland {
    private int[] findCoordinates(int[][] land, int row, int col) {
        int[] coordinates = new int[4];
        coordinates[0] = row;
        coordinates[1] = col;
        int m = land.length;
        int n = land[0].length;
        int r = row;
        int c = col;
        while (r < m && land[r][col] == 1) {
            r++;
        }
        while (c < n && land[row][c] == 1) {
            c++;
        }
        coordinates[2] = r - 1;
        coordinates[3] = c - 1;
        for (int i = row; i < r; i++) {
            for (int j = col; j < c; j++) {
                System.out.println("i = " + i + " j = " + j);
                land[i][j] = 0;
            }
        }
        return coordinates;

    }

    public int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();
        int m = land.length;
        int n = land[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    System.out.println("from main i = " + i + " j = " + j);
                    int[] coordinates = findCoordinates(land, i , j);
                    result.add(coordinates);
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        FindAllGroupsOfFarmland fa = new FindAllGroupsOfFarmland();
        int[][] land = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 1, 1 } };
        int[][] result = fa.findFarmland(land);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
