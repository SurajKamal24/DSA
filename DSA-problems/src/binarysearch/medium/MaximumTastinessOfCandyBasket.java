package binarysearch.medium;

import java.util.Arrays;

public class MaximumTastinessOfCandyBasket {
    public boolean isPossible(int mid, int[] price, int k) {
        int previous = price[0];
        int count = 1;
        for (int i = 1; i < price.length; i++) {
            if (price[i] - previous >= mid) {
                count++;
                previous = price[i];
            }
        }
        //System.out.println("count " + count);
        return count >= k;
    }

    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int ans = 0;
        int n = price.length;
        int st = 0, ed = price[n - 1] - price[0];

        while (st <= ed) {
            int mid = (st + ed) / 2;
            //System.out.println("mid " + mid);
            if (isPossible(mid, price, k)) {
                ans = mid;
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
            //System.out.println("st " + st + " ed " + ed);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumTastinessOfCandyBasket().maximumTastiness(new int[]{1, 3, 6, 7, 9}, 3));
    }
}
