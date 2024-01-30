package strings.easy;

//https://leetcode.com/problems/palindrome-number/description/

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        // delcare rev as long because reverse of 2^11 will not fit in integer
        long rev = 0;
        int copy = x;
        while (copy > 0) {
            int dig = copy%10;
            rev = rev * 10 + dig;
            copy /= 10;
        }
        if (rev == x)
            return true;
        return false;
    }

    /*public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String str = Integer.toString(x);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }*/

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
