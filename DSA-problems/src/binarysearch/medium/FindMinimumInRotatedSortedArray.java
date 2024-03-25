package binarysearch.medium;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, lastEle = nums[r], ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > lastEle) {
                l = mid + 1;
            } else {
                ans = nums[mid];
                r = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println((new FindMinimumInRotatedSortedArray()).findMin(nums));
    }
}
