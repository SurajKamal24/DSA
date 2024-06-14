package leetcodedaily;
import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int numTracker = 0;
        for (int num : nums) {
            numTracker = Math.max(numTracker, num);
            res += numTracker - num;
            numTracker++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumIncrementToMakeArrayUnique().minIncrementForUnique(new int[] {3,2,1,2,1,7}));
    }
}
