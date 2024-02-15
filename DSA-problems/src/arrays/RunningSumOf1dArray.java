package arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        for (int num : runningSum(nums)) {
            System.out.print(num + " ");
        }
    }

}
