// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int mini = prices[0];

        for (int i = 1; i < prices.length; i++) {
            mini = Math.min(mini, prices[i]);
            profit = Math.max(profit, prices[i] - mini);
        }

        return profit;
    }
}