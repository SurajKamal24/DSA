package strings.easy;

//https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }
        for (int n : freq) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        System.out.println(isAnagram(s, t));
    }
}
