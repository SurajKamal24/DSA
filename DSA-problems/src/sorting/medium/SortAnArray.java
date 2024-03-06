package sorting.medium;

//https://leetcode.com/problems/sort-an-array/description/

import java.util.Arrays;

public class SortAnArray {

    public int[] merge2SortedArrays(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums;
        int[] left = Arrays.copyOfRange(nums, 0, n/2);
        int[] right = Arrays.copyOfRange(nums, n/2, n);
        left = sortArray(left);
        right = sortArray(right);
        return merge2SortedArrays(left, right);
    }

    public static void main(String[] args) {
        SortAnArray s = new SortAnArray();
        int[] nums = {5,2,3,1};
        for (int num : s.sortArray(nums)) {
            System.out.print(num + " ");
        }
    }
}
