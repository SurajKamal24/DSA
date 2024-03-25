package sorting.medium;

//https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/

public class SumOfAbsoluteDifferencesInASortedArray {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int leftsum = 0, totalSum = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int leftTotalAns = i * nums[i] - leftsum;
            leftsum += nums[i];
            int rightSum = totalSum - leftsum;
            int rightTotalAns = rightSum - (n-i-1)*nums[i];
            ans[i] = leftTotalAns + rightTotalAns;
        }
        return ans;
    }

    public static void main(String[] args) {
        SumOfAbsoluteDifferencesInASortedArray s = new SumOfAbsoluteDifferencesInASortedArray();
        int[] nums = {2,3,5};
        for (int num : s.getSumAbsoluteDifferences(nums)) {
            System.out.print(num + " ");
        }
    }

}
