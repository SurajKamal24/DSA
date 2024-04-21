package contest.leetcide210424;
import java.util.Arrays;
public class CountTheNumberOfSpecialCharactersII {
    public int numberOfSpecialChars(String word) {
        char[] freq = new char[26];
        Arrays.fill(freq, 'N');
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (ch >= 97 && ch <= 122) {
                if (freq[ch - 97] == 'N') {
                    freq[ch - 97] = 'L';
                }
                if (freq[ch - 97] == 'U') {
                    freq[ch - 97] = 'F';
                }
                if (freq[ch - 97] == 'B') {
                    freq[ch - 97] = 'F';
                }
            }
            if (ch >= 65 && ch <= 90) {
                if (freq[ch - 65] == 'N') {
                    freq[ch - 65] = 'U';
                }
                if (freq[ch - 65] == 'L') {
                    freq[ch - 65] = 'B';
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 'B') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountTheNumberOfSpecialCharactersII().numberOfSpecialChars("AbBCab"));
    }
}
