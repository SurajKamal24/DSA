package arrays;

//https://leetcode.com/problems/squares-of-a-sorted-array/submissions/1175316844/

public class SquaresOfASortedArray {

    static public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = n - 1;
        int ansPtr = n - 1;
        while (i <= j) {
            int x = nums[i]*nums[i];
            int y = nums[j]*nums[j];
            if (x > y) {
                ans[ansPtr--] = x;
                i++;
            } else {
                ans[ansPtr--] = y;
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        for (int num : sortedSquares(nums)) {
            System.out.print(num + " ");
        }
    }

}
