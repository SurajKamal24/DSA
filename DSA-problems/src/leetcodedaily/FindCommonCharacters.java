package leetcodedaily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int minCount = Integer.MAX_VALUE;
            for (String word : words) {
                int count = 0;
                for (char c : word.toCharArray()) {
                    if (c == ch) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
            }
            for (int i = 0; i < minCount; i++) {
                result.add(String.valueOf(ch));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new FindCommonCharacters().commonChars(new String[]{"bella", "label", "roller"}).toString());
    }
}
