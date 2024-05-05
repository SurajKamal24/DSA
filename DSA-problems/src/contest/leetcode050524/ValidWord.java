package contest.leetcode050524;

import static java.lang.Character.*;

public class ValidWord {
    public boolean isValid(String word) {
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        if (word.length() < 3) {
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for (char ch : word.toCharArray()) {
            if (!isLetterOrDigit(ch)) {
                return false;
            }
            if (vowels.indexOf(ch) != -1) {
                hasVowel = true;
            }
            if (consonants.indexOf(ch) != -1) {
                hasConsonant = true;
            }
        }
        return hasVowel && hasConsonant;
    }
    public static void main(String[] args) {
        System.out.println(new ValidWord().isValid("Ya$"));
    }
}
