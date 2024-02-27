package arrays.medium;

//https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int curSum = 0, finalAns = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            if (curSum > finalAns) {
                finalAns = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return finalAns;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
