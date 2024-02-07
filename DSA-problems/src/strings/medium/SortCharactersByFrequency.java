package strings.medium;

//https://leetcode.com/problems/sort-characters-by-frequency/description/?envType=daily-question&envId=2024-02-07

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for (char c : map.keySet()) {
            System.out.println("ch :" + c);
            pq.offer(c);
        }
        StringBuilder sb = new StringBuilder();
        while (! pq.isEmpty()) {
            char ch = pq.poll();
            for (int i = 0; i < map.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "bcdaae";
        System.out.println(frequencySort(s));
    }
}
