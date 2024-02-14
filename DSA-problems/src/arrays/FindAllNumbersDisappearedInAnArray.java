package arrays;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

/*        -4 0
        -3 1
        -2 2
        -7 3
        8 4 + 1 = 5
        2 5 + 1 =6
        -3 6
        -1 7*/

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            nums[Math.abs(num) - 1] = -Math.abs(nums[Math.abs(num) - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
