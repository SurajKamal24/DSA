package strings.easy;

import java.util.Scanner;

public class CheckPalindromeOrNot {

    public static String isPalindrom(String s) {
        int i = 0, j = s.length() - 1;
        String ans = "yes";
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                ans = "no";
                break;
            }
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrom(s));
    }
}
