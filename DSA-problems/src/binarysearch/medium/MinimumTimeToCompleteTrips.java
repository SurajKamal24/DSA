package binarysearch.medium;
//https://leetcode.com/problems/minimum-time-to-complete-trips/
public class MinimumTimeToCompleteTrips {
    public boolean isPossible(int[] time, int totalTrips, long t) {
        long trips = 0;
        for (int i = 0; i < time.length; i++) {
            trips += (t / time[i]);
        }
        return trips >= totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long l = 0, r = (time[0] + 0L) * totalTrips, ans = 0;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (isPossible(time, totalTrips, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new MinimumTimeToCompleteTrips().minimumTime(new int[]{1,2,3}, 5));
    }
}
