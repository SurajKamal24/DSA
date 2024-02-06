package contest.contest1.hard;

//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/maximise-array-operations

import java.util.Scanner;

public class MaximizeArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currNum = sc.nextInt();
            int currX = 0;
            while (currNum % 2 == 0) {
                currNum /= 2;
                currX++;
            }
            ans = Math.min(ans, currX);
        }
        System.out.println(ans);
    }
}
