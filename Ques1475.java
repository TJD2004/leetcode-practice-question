// 1475. Final Prices With a Special Discount in a Shop

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;

        for(int i=0; i<n; i++) {
            int curr = prices[i];

            int j = i + 1;
            while(j < n && curr < prices[j]) {
                j++;
            }

            if(j >= n) {
                prices[i] = curr;
            } else {
                prices[i] = curr - prices[j];
            }
        }

        return prices;
    }
}