package binarysearch.medium;
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
public class CapacityToShipPackagesWithinDDays {
    public int minDaysReq(int[] weights, int cap) {
        int curLoad = 0, curDay = 1;
        for (int i = 0; i < weights.length; i++) {
            if ((curLoad + weights[i]) <= cap) {
                curLoad  += weights[i];
            } else {
                curDay++;
                curLoad = weights[i];
            }
        }
        return curDay;
    }
    public int shipWithinDays(int[] weights, int days) {
        int minCap = Integer.MIN_VALUE;
        int maxCap = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            minCap = Math.max(minCap, weights[i]);
            maxCap += weights[i];
        }
        int ans = -1;
        while (minCap <= maxCap) {
            int midCap = minCap + (maxCap - minCap) / 2;
            int reqDays = minDaysReq(weights, midCap);
            if (reqDays <= days) {
                ans = midCap;
                maxCap = midCap - 1;
            } else {
                minCap = midCap + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new CapacityToShipPackagesWithinDDays().shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
    }
}
