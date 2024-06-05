package leetcodedaily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
                length += 2;
            } else {
                set.add(c);
            }
        }
        if (! set.isEmpty()) {
            length += 1;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("abccccdd"));
    }
}

