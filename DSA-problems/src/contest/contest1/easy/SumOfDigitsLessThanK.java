package contest.contest1.easy;

import java.util.Arrays;
import java.util.Scanner;

//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/sum-of-digits-less-than-k
public class SumOfDigitsLessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int sum = 0;
            while (a > 0) {
                sum += a%10;
                a = a/10;
            }
            if (sum < k)
                count++;
        }
        System.out.println(count);
    }
}
