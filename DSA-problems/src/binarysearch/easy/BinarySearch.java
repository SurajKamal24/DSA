package binarysearch.easy;
//https://leetcode.com/problems/binary-search/description/
public class BinarySearch {
    int searchHelper(int[] nums, int l , int r, int target) {
        if (l > r) {
            return -1;
        } else {
            int mid = (l+r)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return searchHelper(nums, l, mid -1, target);
            } else {
                return searchHelper(nums, mid + 1, r, target);
            }
        }
    }
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(b.search(nums, target));
        System.out.println(b.searchHelper(nums, 0, nums.length, target));
    }
}
