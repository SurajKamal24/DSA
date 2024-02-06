package strings.easy;

//https://codeforces.com/problemset/problem/977/B

public class TwoGram {
    public static void main(String[] args) {
        int n = 7;
        String s = "ABACABA";

        String maxStr = "";
        int maxFreq = 0;

        /*for (int i = 0; i < n -1 ; i++) {
            int currFreq = 0;
            for (int j = i; j < n - 1; j++) {
                if (s.charAt(i) == s.charAt(j) && s.charAt(i+1) == s.charAt(j+1)) {
                    currFreq++;
                }
            }
            if (currFreq > maxFreq) {
                maxFreq = currFreq;
                StringBuilder str = new StringBuilder();
                str.append(s.charAt(i));
                str.append(s.charAt(i+1));
                maxStr = str.toString();
            }
        }*/

        for (int i = 0; i < n - 1; i++) {

        }

        System.out.println(maxStr);
    }
}
