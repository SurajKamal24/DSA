package sorting;

//https://leetcode.com/problems/maximum-units-on-a-truck/description/

import java.util.Arrays;

public class MaximumUnitsOnATruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int ans = 0;
        for (int[] b : boxTypes) {
            int count = Math.min(b[0], truckSize);
            ans += count * b[1];
            truckSize -= count;
            if (truckSize == 0) return ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumUnitsOnATruck m = new MaximumUnitsOnATruck();
        int[][] boxTypes = {{1,3}, {2,2}, {3,1}};
        int truckSize = 4;
        System.out.println(m.maximumUnits(boxTypes, truckSize));
    }

}
