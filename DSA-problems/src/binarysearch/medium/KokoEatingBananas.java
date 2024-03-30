package binarysearch.medium;
//https://leetcode.com/problems/koko-eating-bananas/description/
public class KokoEatingBananas {
    public long hoursRequired(int[] piles, long k) {
        long hoursReq = 0;
        for (int pile : piles) {
            hoursReq = hoursReq + (pile / k);
            if  (pile % k != 0 ) {
                hoursReq++;
            }
        }
        return hoursReq;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long minSpeed = 1;
        long maxSpeed = piles[0];
        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, (long) pile);
        }
        long ans = -1;
        while(minSpeed <= maxSpeed) {
            long midSpeed = minSpeed + (maxSpeed - minSpeed) / 2;
            long reqHours = hoursRequired(piles, midSpeed);
            if (reqHours <= h) {
                ans = midSpeed;
                maxSpeed = midSpeed - 1;
            } else {
                minSpeed = midSpeed + 1;
            }
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        System.out.println(new KokoEatingBananas().minEatingSpeed(new int[]{3,6,7,11}, 8));
    }
}
