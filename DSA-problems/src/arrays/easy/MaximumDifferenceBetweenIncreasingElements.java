package arrays.easy;

public class MaximumDifferenceBetweenIncreasingElements {

    public int maximumDifference(int[] nums) {
        int ans = -1, minTillNow = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > minTillNow) {
                ans = Math.max(ans, nums[j] - minTillNow);
            }
            minTillNow = Math.min(minTillNow, nums[j]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,4};
        MaximumDifferenceBetweenIncreasingElements m = new MaximumDifferenceBetweenIncreasingElements();
        System.out.println(m.maximumDifference(nums));
    }

}
