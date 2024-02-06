package contest.contest1.hard;

//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/a-to-z-string

import java.util.Scanner;

public class AToZString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int start = 0, end = 0;
        for (int i = 0; i < n; i++){
            if (s.charAt(i) - 'A' == 0) {
                start = i;
                break;
            }
        }
        for(int i = n-1; i >= 0; i--){
            if(s.charAt(i) == 'Z'){
                end = i;
                break;
            }
        }
        int ans = end - start + 1;
        System.out.println(ans);
    }
}
