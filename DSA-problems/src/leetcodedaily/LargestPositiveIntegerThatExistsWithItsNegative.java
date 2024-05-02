package leetcodedaily;

import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = -1;
        for (int num : nums) {
            set.add(num);
            int k = (-num);
            if (set.contains(k)) {
                ans = Math.max(ans, Math.abs(num));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new LargestPositiveIntegerThatExistsWithItsNegative().findMaxK(new int[]{3, 2, -2, 5, -3}));
    }
}
