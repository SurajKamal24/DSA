package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int small, big;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int k = 0;
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
            if (small == big) {
                ans.add(small);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new LuckyNumbersInAMatrix().luckyNumbers(new int[][]{{3,7,8},{9,11,13},{15,16,17}}));
    }
}
