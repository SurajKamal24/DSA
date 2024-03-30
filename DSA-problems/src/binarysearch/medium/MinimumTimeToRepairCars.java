package binarysearch.medium;
//https://leetcode.com/problems/minimum-time-to-repair-cars/description/
public class MinimumTimeToRepairCars {
    public boolean isPossible(int[] ranks, int cars, long m) {
        long car = 0;
        for (int i = 0; i < ranks.length; i++) {
            long rem = m / ranks[i];
            car += Math.sqrt(rem);
        }
        return car >= cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long l = 0, r = ranks[0] * (long) cars * cars, ans = 0;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (isPossible(ranks, cars, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new MinimumTimeToRepairCars().repairCars(new int[]{4,2,3,1}, 10));
    }
}
