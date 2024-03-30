package binarysearch.easy;

import java.util.Arrays;

public class RandomBinarySearchableCount {
    public int randomBinarySearch(int[] nums, int n) {
        int[] preMax = new int[n];
        int[] sufMin = new int[n];
        for (int i = 0; i < n; i++) {
            preMax[i] = i == 0 ? nums[i] : Math.max(nums[i], preMax[i - 1]);
        }
        System.out.println(Arrays.toString(preMax));
        for (int i = n -1 ; i >= 0; i--) {
            sufMin[i] = i == n - 1 ? nums[i] : Math.min(nums[i], sufMin[i + 1]);
        }
        System.out.println(Arrays.toString(sufMin));
        int count = 0;
        for (int i = 0; i < n; i++) {
            int leftMax = (i == 0)? Integer.MIN_VALUE : preMax[i - 1];
            int rightMin = (i == n - 1)? Integer.MAX_VALUE : sufMin[i + 1];
            if (nums[i] > leftMax && nums[i] < rightMin) {
                count++;
                System.out.println("num " + nums[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 6, 4, 10, 3, 5, 7};
        System.out.println(new RandomBinarySearchableCount().randomBinarySearch(nums, 7));
    }
}
