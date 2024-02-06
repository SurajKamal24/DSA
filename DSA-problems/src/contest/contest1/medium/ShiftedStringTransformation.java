package contest.contest1.medium;

//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/shifted-string-transformation

import java.util.Scanner;

public class ShiftedStringTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int diff = (a.charAt(0) - b.charAt(0) + 26) % 26;
        for (int i = 1; i < a.length(); i++) {
            if (((a.charAt(i) - b.charAt(i) + 26) % 26) != diff) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
