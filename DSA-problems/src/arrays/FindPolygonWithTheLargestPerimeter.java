package arrays;

//https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/description/?envType=daily-question&envId=2024-02-15

import java.util.Arrays;

public class FindPolygonWithTheLargestPerimeter {

    public static long largestPerimeter(int[] nums) {
        long sum = 0;
        long ans = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            if (sum > num) {
                ans = sum + num;
            }
            sum += num;
        }
        return ans == 0 ? -1 : ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,1,2,5,50,3};
        System.out.println(largestPerimeter(nums));
    }

}
