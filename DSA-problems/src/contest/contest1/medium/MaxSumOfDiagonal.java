package contest.contest1.medium;

//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/max-sum-of-diagonal

import java.util.Scanner;

public class MaxSumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        long ans = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int row = 0, col = i;
            long sum1 = 0, sum2 = 0;
            while (row < n && col < n) {
                sum1 += a[row][col];
                sum2 += a[col][row];
                row++;
                col++;
            }
            long temp = Math.max(sum1, sum2);
            if (temp > ans)
                ans = temp;
        }
        System.out.println(ans);
    }
}
