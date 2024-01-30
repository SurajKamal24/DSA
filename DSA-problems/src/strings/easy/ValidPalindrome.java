package strings.easy;

//https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {

    private static boolean isAlphanumeric(char c) {
        if(c >= '0' && c <= '9') return true;
        if(c >= 'a' && c <= 'z') return true;
        return false;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        s = s.toLowerCase();
        for (int i = 0; i < n; i++) {
            if (isAlphanumeric(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
        String valStr = str.toString();
        String revStr = str.reverse().toString();

        return valStr.equals(revStr);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        String str = "AB";
        System.out.println(str.charAt(2));
    }

}
