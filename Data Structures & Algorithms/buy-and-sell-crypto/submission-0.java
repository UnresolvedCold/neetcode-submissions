class Solution {
    public int maxProfit(int[] prices) {
        // brute force
        int res = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                res = Math.max(res, prices[j]-prices[i]);
            }
        }

        return res;
    }
}
