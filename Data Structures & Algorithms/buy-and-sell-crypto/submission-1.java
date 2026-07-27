class Solution {
    public int maxProfit(int[] prices) {
        // Optimization
        // keep looking for next lowest price
        // and mapping profit

        int res = 0;
        int n = prices.length;

        int lowestTillNow = 0;
        int i = 0;

        while (i < n) {
            if (prices[lowestTillNow] > prices[i]) {
                lowestTillNow = i;
            }

            res = Math.max(res, prices[i] - prices[lowestTillNow]);
            i++;
        }

        return res;
    }
}
