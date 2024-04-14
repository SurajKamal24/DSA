package contest.leetcode140424;

public class MaximumPrimeDifference {

    boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            if (isPrime(nums[l]) && isPrime(nums[r])) {
                return Math.abs(l - r);
            }
            if (!isPrime(nums[l])) {
                l++;
            }
            if (!isPrime(nums[r])) {
                r--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumPrimeDifference().maximumPrimeDifference(new int[]{4, 8, 2, 8}));
    }
}
