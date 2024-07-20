package contest.biweeklycontest135;

import java.util.HashMap;
import java.util.Map;

public class MinimumLengthOfStringAfterOperations {
    public int minimumLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, 1 + map.getOrDefault(c, 0));
        }
        int res = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                res += 2;
            } else {
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumLengthOfStringAfterOperations().minimumLength("abaacbcbb"));
    }
}
