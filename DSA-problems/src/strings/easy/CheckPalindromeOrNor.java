package strings.easy;

import java.util.Scanner;

public class CheckPalindromeOrNor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0, j = str.length() - 1;
        String ans = "yes";
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                ans = "no";
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
