package leetcodedaily;

import java.util.*;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<>(dictionary);
        List<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        StringBuilder res = new StringBuilder();
        for (String s : list) {
            int i = 0;
            while (i <= s.length()) {
                String curr = s.substring(0, i);
                if (set.contains(curr)) {
                    res.append(curr).append(" ");
                    break;
                }
                i++;
            }
            if (i == s.length() + 1) {
                res.append(s).append(" ");
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReplaceWords().replaceWords(List.of("cat","bat","rat"), "the cattle was rattled by the battery"));
    }
}
