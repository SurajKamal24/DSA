package strings.easy;

import com.sun.jdi.request.MethodEntryRequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] paragraphWords = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ").split(" ");
        List<String> bannedWords = Arrays.asList(banned);
        Map<String, Integer> map = new HashMap<>();
        for (String s : paragraphWords) {
            if (! bannedWords.contains(s) && ! s.equalsIgnoreCase("")) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        int maxValue = Integer.MIN_VALUE;
        String ans = "";
        for (Map.Entry<String, Integer> item: map.entrySet()) {
            if (item.getValue() > maxValue) {
                maxValue = item.getValue();
                ans = item.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new MostCommonWord().mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));
    }
}
