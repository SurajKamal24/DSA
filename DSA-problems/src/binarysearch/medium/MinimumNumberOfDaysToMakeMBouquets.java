package binarysearch.medium;
//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
public class MinimumNumberOfDaysToMakeMBouquets {
    public int countBouquet(int[] bloomDay, int k, int day) {
        int flowers = 0, bouquets = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (day >= bloomDay[i]) {
                flowers++;
            } else {
                flowers = 0;
            }
            if (flowers == k) {
                bouquets++;
                flowers = 0;
            }
        }
        return bouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long n = bloomDay.length;
        long total = (long) m * (long) k;
        if (n < total) {
            return -1;
        }
        int l = 0, r = (int) 1e9 + 1, day;
        while (l + 1 < r) {
            day = (l + r) / 2;
            if (countBouquet(bloomDay, k, day) < m) {
                l = day;
            } else {
                r = day;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumNumberOfDaysToMakeMBouquets().minDays(new int[]{1,10,3,10,2}, 3, 1));
        System.out.println(new MinimumNumberOfDaysToMakeMBouquets().minDays(new int[]{1,10,3,10,2}, 3, 2));
        System.out.println(new MinimumNumberOfDaysToMakeMBouquets().minDays(new int[]{7,7,7,7,12,7,7}, 2, 3));
    }
}
