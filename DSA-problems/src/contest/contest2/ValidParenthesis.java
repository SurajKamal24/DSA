package contest.contest2;

import java.util.Scanner;

public class ValidParenthesis {
    static String solve(String S) {
        int openCount = 0;
        int closeCount = 0;
        int n = S.length();
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                openCount++;
            } else {
                openCount--;
            }
            if (S.charAt(i) == ')') {
                closeCount++;
            } else {
                closeCount--;
            }
            if (openCount < 0) {
                sb.insert(0, '(');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();
        System.out.println(solve(S));
    }
}
