package arrays;

//https://leetcode.com/problems/merge-sorted-array/description/

import java.util.ArrayList;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> aux = new ArrayList<>();
        int i = 0,  j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                aux.add(nums1[i++]);
            } else {
                aux.add(nums2[j++]);
            }
        }
        while (i < m) {
            aux.add(nums1[i++]);
        }
        while (j < n) {
            aux.add(nums2[j++]);
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k] = aux.get(k);
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3, n = 3;
        merge(num1, m, num2, n);
        for (int num : num1) {
            System.out.print(num + " ");
        }
    }

}
