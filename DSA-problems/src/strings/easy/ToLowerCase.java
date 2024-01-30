package strings.easy;

//https://leetcode.com/problems/to-lower-case/description/

public class ToLowerCase {
    public static String toLowerCase(String s) {
        //return s.toLowerCase();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }
}
