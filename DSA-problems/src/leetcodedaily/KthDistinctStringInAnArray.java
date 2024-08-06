package leetcodedaily;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : arr) {
            if (map.get(s) == 1) {
                k--;
                if (k == 0) {
                    return s;
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(new KthDistinctStringInAnArray().kthDistinct(new String[] {"a", "b", "c", "a", "b", "c"}, 2));
    }
}
