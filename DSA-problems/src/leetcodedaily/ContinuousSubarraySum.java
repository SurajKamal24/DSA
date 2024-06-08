package leetcodedaily;

import java.util.Map;
import java.util.HashMap;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        int sum = 0;
        remainderIndexMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum %= k;
            }
            if (remainderIndexMap.containsKey(sum)) {
                if (i - remainderIndexMap.get(sum) > 1)
                    return true;
            } else {
                remainderIndexMap.put(sum, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContinuousSubarraySum().checkSubarraySum(new int[]{23,2,4,6,7}, 6));
    }
}
