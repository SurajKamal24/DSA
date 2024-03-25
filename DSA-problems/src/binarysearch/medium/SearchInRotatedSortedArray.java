package binarysearch.medium;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int lastEle = nums[r];
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target > lastEle && nums[mid] <= lastEle) {
                r = mid - 1;
            } else if (target <= lastEle && nums[mid] > lastEle) {
                l = mid + 1;
            } else {
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(s.search(nums, target));
    }
}
