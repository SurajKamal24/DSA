package arrays;

//https://leetcode.com/problems/max-consecutive-ones/

public class MaxConsecutiveOnes {

    static public int findMaxConsecutiveOnes(int[] nums) {
        /*int cur_ones = 0, final_ans = 0;
        for (int num : nums) {
            if (num == 0)
                cur_ones = 0;
            else
                cur_ones += 1;
            final_ans = Math.max(final_ans, cur_ones);
        }
        return final_ans;*/
        int j = 0, res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                j++;
            } else {
                if (j > res) {
                    res = j;
                }
                j = 0;
            }
        }
        if (j > res) {
            res = j;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

}
