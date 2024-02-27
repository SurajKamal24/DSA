package arrays.medium;

//https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/description/

public class FindTheScoreOfAllPrefixesOfAnArray {

    public long[] findPrefixScore(int[] nums) {
        long max = 0, sum = 0;
        long[] ans = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            ans[i] = nums[i] + max + sum;
            sum = ans[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,7,5,10};
        FindTheScoreOfAllPrefixesOfAnArray f = new FindTheScoreOfAllPrefixesOfAnArray();
        for (long num : f.findPrefixScore(nums)) {
            System.out.print(num + " ");
        }

    }

}
