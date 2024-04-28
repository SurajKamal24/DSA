package contest.leetcode280424;

public class FindTheIntegerAddedToArrayI {
    public int addedInteger(int[] nums1, int[] nums2) {
        int diff = 0;
        for (int i = 0; i < nums1.length; i++) {
            diff += nums2[i] - nums1[i];
        }
        return diff/nums1.length;
    }

    public static void main(String[] args) {
        System.out.println(new FindTheIntegerAddedToArrayI().addedInteger(new int[]{1, 2, 3}, new int[]{2, 3, 4}));
    }
}
