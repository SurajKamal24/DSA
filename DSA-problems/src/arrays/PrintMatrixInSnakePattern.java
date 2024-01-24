package arrays;

import java.util.ArrayList;

public class PrintMatrixInSnakePattern {
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    ans.add(matrix[i][j]);
                }
            }
            else {
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {45, 48, 54},
                        {21, 89, 87},
                        {70, 78, 15}
                };
        for (int num : snakePattern(matrix)) {
            System.out.print(num + " ");
        }
    }
}
