package sorting;

//https://leetcode.com/problems/arithmetic-subarrays/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<Boolean>();
        for (int i = 0; i < l.length; i++) {
            int[] subArray = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            ans.add(check(subArray));
        }
        return ans;
    }

    private boolean check(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i] - arr[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArithmeticSubarrays a = new ArithmeticSubarrays();
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};
        System.out.println(a.checkArithmeticSubarrays(nums, l, r));
    }

}
