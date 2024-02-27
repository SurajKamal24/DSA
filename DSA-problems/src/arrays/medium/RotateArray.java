package arrays.medium;

//https://leetcode.com/problems/rotate-array/description/

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] temp = new int[k];
        int j = 0;
        for (int i = n - k; i < n; i++){
            temp[j++] = nums[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray r = new RotateArray();
        r.rotate(nums, k);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

}
