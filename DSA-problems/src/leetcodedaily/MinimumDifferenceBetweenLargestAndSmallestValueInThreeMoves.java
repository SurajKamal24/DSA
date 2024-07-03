package leetcodedaily;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        return Math.min(
                Math.min(nums[n - 1] - nums[3], nums[n - 2] - nums[2]),
                Math.min(nums[n - 3] - nums[1], nums[n - 4] - nums[0])
        );
    }
    public static void main(String[] args) {
        System.out.println(new MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves().minDifference(new int[]{1,5,0,10,14}));
    }
}
