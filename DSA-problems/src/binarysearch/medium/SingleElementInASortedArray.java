package binarysearch.medium;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                r = mid ;
            } else {
                l = mid + 2;
            }
        }
        return nums[l];
    }
    public static void main(String[] args) {
        System.out.println(new SingleElementInASortedArray().singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
}
