package contest.biweeklycontest136;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfWinningPlayers {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < pick.length; i++) {
            if (map.containsKey(pick[i][0])) {
                Map<Integer, Integer> tempMap = map.get(pick[i][0]);
                tempMap.put(pick[i][1], tempMap.getOrDefault(pick[i][1], 0) + 1);
                map.put(pick[i][0], tempMap);
            } else {
                Map<Integer, Integer> tempMap = new HashMap<>();
                tempMap.put(pick[i][1], tempMap.getOrDefault(pick[i][1], 1));
                map.put(pick[i][0], tempMap);
            }
        }
        int res = 0;
        int i = 1;
        for (Map.Entry<Integer, Map<Integer, Integer>> m : map.entrySet()) {
            int player = m.getKey();
            boolean win = false;
            for (Map.Entry<Integer, Integer> m1 : m.getValue().entrySet()) {
                if (m1.getValue() >= player + 1) {
                    win = true;
                    break;
                }
            }
            if (win) {
                res++;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(new FindTheNumberOfWinningPlayers().winningPlayerCount(4, new int[][] {{1, 1}, {2,4}, {2,4}, {2, 4}}));
        System.out.println(new FindTheNumberOfWinningPlayers().winningPlayerCount(4, new int[][] {{0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0}}));
    }
}
