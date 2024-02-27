package arrays.easy;

//https://leetcode.com/problems/range-sum-query-immutable/description/

public class RangeSumQueryImmutable {

    int[] prevSum;

    public RangeSumQueryImmutable(int[] nums) {
        prevSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prevSum[i] = i == 0 ? nums[i] : nums[i] + prevSum[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return prevSum[right];
        return prevSum[right] - prevSum[left - 1];
    }


    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable r = new RangeSumQueryImmutable(nums);
        System.out.println(r.sumRange(0,2));
        System.out.println(r.sumRange(2,5));
    }

}
