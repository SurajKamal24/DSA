package strings.medium;

// https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for (int i = str.length - 1; i >=0; i--) {
            if (! str[i].isEmpty()) {
                sb.append(str[i]);
                sb.append(" ");
            }
        }
        String ans = sb.toString();
        return ans.trim();
    }
    public static void main(String[] args) {
        String s = "a good   example";
       System.out.println(reverseWords(s));
    }
}
