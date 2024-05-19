package contest.leetcode19052024;

public class SpecialArrayI {
    public boolean isArraySpecial(int[] nums) {
        int diff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            diff = Math.abs(nums[i] - nums[i + 1]);
            if (diff % 2 == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(new SpecialArrayI().isArraySpecial(new int[] {4,3,1,6}));
    }
}
