package strings.easy;

//https://leetcode.com/problems/reverse-only-letters/description/

public class ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j =  s.length() - 1;
        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);

    }
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
}
