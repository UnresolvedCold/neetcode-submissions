class Solution {
    public int maxArea(int[] heights) {
        // Pattern 
        // Move the shorter wall because keeping it cannot produce a larger area
        int n = heights.length;

        int res = 0;

        int s = 0;
        int e = n-1;

        while (s<e) {
            int prod = Math.min(heights[s], heights[e]) * (e-s);

            if (res < prod) {
                res = prod;
            }

            if (heights[s] > heights[e]) e--;
            else s++;

        }

        return res;
    }
}
