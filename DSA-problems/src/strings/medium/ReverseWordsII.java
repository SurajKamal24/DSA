package strings.medium;

//https://leetcode.com/problems/reverse-words-in-a-string-ii/

public class ReverseWordsII {
    public static void reverseWords(char[] c) {
        int i = 0, j = c.length - 1;
        char temp;
        while (i < j) {
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        j = 0;
        int k = 0;
        for (i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                if (c[i - 1] ==  ' '){
                    System.out.println("Previous reverse");
                    j = i + 1;
                } else {
                    k = i - 1;
                    System.out.println("Before reverse");
                    System.out.println("i " + i);
                    System.out.println("j " + j);
                    System.out.println("k " + k);
                    while (j < k) {
                        temp = c[j];
                        c[j] = c[k];
                        c[k] = temp;
                        j++;
                        k--;
                    }
                }
                j = i + 1;
                System.out.println("After reverse");
                System.out.println("i " + i);
                System.out.println("j " + j);
                System.out.println("k " + k);

            } else if (i == c.length - 1) {
                k = i;
                System.out.println("Before last reverse");
                System.out.println("i " + i);
                System.out.println("j " + j);
                System.out.println("k " + k);
                while (j < k) {
                    temp = c[j];
                    c[j] = c[k];
                    c[k] = temp;
                    j++;
                    k--;
                }
                j = i + 1;
                System.out.println("After last reverse");
                System.out.println("i " + i);
                System.out.println("j " + j);
                System.out.println("k " + k);
            }
        }
        for (char ch : c) {
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        char[] c = {'t', 'h', 'e', ' ', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
        reverseWords(c);

    }
}
