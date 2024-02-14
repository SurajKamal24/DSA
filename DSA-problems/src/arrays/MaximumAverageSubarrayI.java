package arrays;

//https://leetcode.com/problems/maximum-average-subarray-i/

public class MaximumAverageSubarrayI {

    static public double findMaxAverage(int[] nums, int k) {
        int curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }
        double maxSum = curSum;
        for (int i = k; i < nums.length; i++) {
            curSum = curSum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum/k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }
}
