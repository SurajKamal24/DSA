package contest.contest2;

import java.util.List;
import java.util.Scanner;

public class QueryString {
    static String solve(String S, char[][] queries) {
        StringBuilder sb = new StringBuilder(S);
        boolean flag = true;
        for (int i = 0; i < queries.length; i++) {
            char[] query = queries[i];
            if (query[0] == '1' && flag) {
                sb = sb.reverse();
                flag = false;
            } else if (query[0] == '2') {
                int x = query[1];
                int y = query[2];
                if (x == '1') {
                    sb = sb.insert(0, (char)y);
                } else if (x == '2') {
                    sb = sb.append((char)y);
                }
                flag = true;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int Q = scanner.nextInt();
        char[][] queries = new char[Q][];
        for (int i = 0; i < Q; ++i) {
            int t = scanner.nextInt();
            if (t == 1) {
                queries[i] = new char[]{ '1' };
            } else {
                queries[i] = new char[]{ '2', scanner.next().charAt(0), scanner.next().charAt(0) };
            }
        }
        System.out.println(solve(S, queries));
    }
}
