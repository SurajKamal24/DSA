package strings.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        /*Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
       for (int i = 0; i < s.length(); i++) {
           if (map.get(s.charAt(i)) == 1)
               return i;
       }
       return -1;*/
        int[] arr = new int[26];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] == 0) {
                arr[s.charAt(i) - 97] = i + 1;
            } else {
                arr[s.charAt(i) - 97] = -1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                min = Math.min(min, arr[i]);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min - 1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
}
