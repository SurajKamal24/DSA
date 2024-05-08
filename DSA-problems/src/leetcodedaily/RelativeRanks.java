package leetcodedaily;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        for (int i = score.length - 1; i >= 0; i--) {
            int rank = score.length - i;
            int index = map.get(score[i]);
            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new RelativeRanks().findRelativeRanks(new int[]{10,3,8,9,4}));
    }
}
