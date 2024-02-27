package arrays.easy;

//https://leetcode.com/problems/left-and-right-sum-differences/description/

public class LeftAndRightSumDifferences {

    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int leftSum = 0, rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        ans[0] = rightSum - leftSum;
        for (int i = 1; i < nums.length; i++) {
            rightSum -= nums[i];
            leftSum += nums[i-1];
            ans[i] = Math.abs(rightSum - leftSum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        LeftAndRightSumDifferences l = new LeftAndRightSumDifferences();
        for (int num : l.leftRightDifference(nums)) {
            System.out.print(num + " ");
        }
    }

}
