package arrays.easy;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int ans = 0, minTillNow = Integer.MAX_VALUE;
        for (int j = 0; j < prices.length; j++) {
            if (prices[j] > minTillNow) {
                ans = Math.max(ans, prices[j] - minTillNow);
            }
            minTillNow = Math.min(minTillNow, prices[j]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        System.out.println(b.maxProfit(prices));
    }
}
