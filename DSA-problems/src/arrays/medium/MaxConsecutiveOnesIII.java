package arrays.medium;

//https://leetcode.com/problems/max-consecutive-ones-iii/submissions/1187252067/

public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, zeroCount = 0, ans = Integer.MIN_VALUE;
        while (r < nums.length) {
            if (nums[r] == 0)
                zeroCount++;
            while (zeroCount > k) {
                if (nums[l] == 0)
                    zeroCount--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

}
