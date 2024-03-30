package binarysearch.medium;
//https://leetcode.com/problems/minimum-speed-to-arrive-on-time/
public class MinimumSpeedToArriveOnTime {
    public boolean isPossible(int[] dist, double hour, int speed) {
        double h = 0;
        int n = dist.length;
        for (int i = 0; i < n - 1; i++) {
            if (dist[i] % speed == 0) {
                h += dist[i] / speed;
            } else {
                h += (dist[i] / speed) + 1;
            }
        }
        h += (double) dist[n - 1] / speed;
        return h <= hour;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1, r = 10000001, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(dist, hour, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new MinimumSpeedToArriveOnTime().minSpeedOnTime(new int[]{1,3,2}, 6));
    }
}
