package leetcodedaily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RangeSumOfSortedSubarraySums {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);
        int res = 0;
        int MOD = 1000000007;
        for (int i = left - 1; i < right; i++) {
            res = (res + list.get(i)) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new RangeSumOfSortedSubarraySums().rangeSum(new int[] {1, 2, 3, 4}, 4, 1, 5));
    }
}
