package sorting.easy;

//https://leetcode.com/problems/minimum-common-value/description/

public class MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                return nums1[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MinimumCommonValue m = new MinimumCommonValue();
        int[] num1 = {1,2,3};
        int[] num2 = {2,4};
        System.out.println(m.getCommon(num1, num2));
    }

}
