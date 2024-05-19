package contest.leetcode19052024;

import java.util.ArrayList;
import java.util.List;

public class SpecialArrayII {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] prefixDifferentParity = new int[n];

        // Preprocess to check parity differences between adjacent elements
        for (int i = 0; i < n - 1; i++) {
            prefixDifferentParity[i + 1] = prefixDifferentParity[i] + ((nums[i] % 2) != (nums[i + 1] % 2) ? 1 : 0);
        }

        boolean[] result = new boolean[queries.length];
        for (int k = 0; k < queries.length; k++) {
            int fromi = queries[k][0];
            int toi = queries[k][1];

            if (fromi == toi) {
                result[k] = true; // A single element subarray is always special
            } else {
                result[k] = (prefixDifferentParity[toi] - prefixDifferentParity[fromi]) == (toi - fromi);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        for (boolean b : new SpecialArrayII().isArraySpecial(new int[] {4, 3, 1, 6}, new int[][] {{0, 2}, {2, 3}})) {
            System.out.println(b);
        }
    }
}
