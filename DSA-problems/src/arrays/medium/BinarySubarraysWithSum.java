package arrays.medium;

//https://leetcode.com/problems/binary-subarrays-with-sum/description/

public class BinarySubarraysWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int st = 0, en = 0, count = 0, sum = 0;
        while (en < nums.length) {
            sum += nums[st];
            while (sum == goal) {
                count++;

            }
        }
        return 1;
    }

    public static void main(String[] args) {
        BinarySubarraysWithSum b = new BinarySubarraysWithSum();
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(b.numSubarraysWithSum(nums, goal));
    }

}
