package arrays;

import java.util.Arrays;

public class MinimumNumberGame {

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i +=2) {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        for (int num : numberGame(nums)) {
            System.out.print(num + " ");
        }
    }
}
