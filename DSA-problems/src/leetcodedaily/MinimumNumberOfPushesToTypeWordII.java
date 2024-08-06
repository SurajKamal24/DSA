package leetcodedaily;

import java.util.Arrays;
import java.util.Collections;

public class MinimumNumberOfPushesToTypeWordII {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Integer[] sortedFreq = new Integer[26];
        for (int i = 0; i < 26; i++) {
            sortedFreq[i] = freq[i];
        }
        Arrays.sort(sortedFreq, Collections.reverseOrder());
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (sortedFreq[i] == 0) break;
            res += (i / 8 + 1) * sortedFreq[i];
        }
        return res;
    }

    public static void main(String[] args) {
        MinimumNumberOfPushesToTypeWordII minimumNumberOfPushesToTypeWordII = new MinimumNumberOfPushesToTypeWordII();
        System.out.println(minimumNumberOfPushesToTypeWordII.minimumPushes("aabbccddeeffgghhiiiiii"));
    }
}
