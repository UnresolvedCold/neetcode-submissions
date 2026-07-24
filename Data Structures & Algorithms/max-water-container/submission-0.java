class Solution {
    public int maxArea(int[] heights) {
        // Brute force 
        int n = heights.length;

        int res = 0;
        for (int i=0; i<n; i++) {
            for (int j=n-1; j>=0; j--) {
                int water = Math.min(heights[i], heights[j]) * (j - i);
                if (water > res) {
                    res = water;
                }
            }
        }

        return res;
    }
}
