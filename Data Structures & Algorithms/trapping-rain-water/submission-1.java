class Solution {
    public int trap(int[] height) {
       // Brute force
       // For each height I need wall on left and wall on right
       // Water it will contribute = min(wall left, wall right) - height[i]

        int n = height.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int leftWall = i;
            int rightWall = i;

            for (int k=i; k >= 0; k--) {
                if (height[k] >= height[leftWall]) {
                    leftWall = k;
                }
            }

            for (int k=i; k < n; k++) {
                if (height[k] > height[rightWall]) {
                    rightWall = k;
                }
            }

            res += Math.min(height[leftWall], height[rightWall]) - height[i];
        }

        return res;
    }
}
