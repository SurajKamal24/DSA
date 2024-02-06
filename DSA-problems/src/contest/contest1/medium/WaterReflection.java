package contest.contest1.medium;

//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/water-reflection/problem

import java.util.Scanner;

public class WaterReflection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n/2; i++) {
            int[] temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1]=temp;

        }
        for (int i = 0 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
