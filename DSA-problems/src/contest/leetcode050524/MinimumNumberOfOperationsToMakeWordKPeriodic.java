package contest.leetcode050524;

import java.util.HashMap;

public class MinimumNumberOfOperationsToMakeWordKPeriodic {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        int n = word.length();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i += k) {
            String sub = word.substring(i, i + k);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }
        int mostFreqSubstring = 0;
        for (int freq : map.values()) {
            mostFreqSubstring = Math.max(mostFreqSubstring, freq);
        }

        return n / k - mostFreqSubstring;
    }
    public static void main(String[] args) {
        System.out.println(new MinimumNumberOfOperationsToMakeWordKPeriodic().minimumOperationsToMakeKPeriodic("leetcodeleet", 4));
    }
}
