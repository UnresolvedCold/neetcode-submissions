class Solution {
    public int maxArea(int[] heights) {
        // Pattern 
        // If you are on lower height and next is also lower than this height then it does not matter
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
