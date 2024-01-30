package strings.easy;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/valid-palindrome-ii/description/

public class ValidPalindromeII {
    public static boolean isPalindrom(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrom(s, i, j-1) || isPalindrom(s, i+1, j)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }
}
