package sorting.easy;

//https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        Collections.sort(arr);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + 1 < arr.size(); i++) {
            ans = Math.min(ans, (arr.get(i+1) - arr.get(i)));
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2));
        System.out.println(minimumAbsoluteDifference(arr));
    }
}
