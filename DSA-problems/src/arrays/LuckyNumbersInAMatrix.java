package arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int small, big;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int k =0;
            small = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < small) {
                    small = matrix[i][j];
                    k = j;
                }
            }
            big = small;
            for (int j = 0; j < matrix.length; j++) {
                big = Math.max(big, matrix[j][k]);
            }
            if (small == big)
                ans.add(small);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {3,7,8},
                        {9,11,13},
                        {15,16,17}
                };
        for (int num : luckyNumbers(matrix)) {
            System.out.print(num + " ");
        }
    }

}
