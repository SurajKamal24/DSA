package contest.weeklycontest399;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOfGoodPairsII {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> divisorCount = new HashMap<>();
        for (int num : nums2) {
            int divisor = num * k;
            divisorCount.put(divisor, divisorCount.getOrDefault(divisor, 0) + 1);
        }
        long pairCount = 0;
        for (int num : nums1) {
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    int complement = num / i;
                    if (divisorCount.containsKey(i)) {
                        pairCount += divisorCount.get(i);
                    }
                    if (complement != i && divisorCount.containsKey(complement)) {
                        pairCount += divisorCount.get(complement);
                    }
                }
            }
        }

        return pairCount;
    }

    public static void main(String[] args) {
        System.out.println(new FindTheNumberOfGoodPairsII().numberOfPairs(new int[] {1,3,4}, new int[] {1,3,4}, 1));
    }
}
