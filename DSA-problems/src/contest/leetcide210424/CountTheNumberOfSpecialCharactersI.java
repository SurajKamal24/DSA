package contest.leetcide210424;

public class CountTheNumberOfSpecialCharactersI {
    public int numberOfSpecialChars(String word) {
        int[] freqLC = new int[26];
        int[] freqUC = new int[26];
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (ch >= 97 && ch <= 122) {
                freqLC[ch - 97]++;
            }
            if (ch >= 65 && ch <= 90) {
                freqUC[ch - 65]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (freqLC[i] > 0 && freqUC[i] > 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new CountTheNumberOfSpecialCharactersI().numberOfSpecialChars("aaAbcBC"));
    }
}
