package leetcodedaily;

import java.util.Arrays;

public class SortAnArray {
    private int[] merge2SortedArrays(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ans[k++] = left[i++];
            } else {
                ans[k++] = right[j++];
            }
        }
        while (i < left.length) {
            ans[k++] = left[i++];
        }
        while (j < right.length) {
            ans[k++] = right[j++];
        }
        return ans;
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums;
        }
        int[] left = Arrays.copyOfRange(nums, 0, n/2);
        int[] right = Arrays.copyOfRange(nums, n/2, n);
        left = sortArray(left);
        right = sortArray(right);
        return merge2SortedArrays(left, right);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortAnArray().sortArray(new int[] {5,2,3,1})));
    }
}
