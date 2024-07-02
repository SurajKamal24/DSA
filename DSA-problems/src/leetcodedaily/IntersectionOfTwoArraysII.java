package leetcodedaily;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                nums1[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new IntersectionOfTwoArraysII().intersect(new int[]{1,2,2,1}, new int[]{2,2})));
    }
}
