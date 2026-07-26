class Solution {
    public int trap(int[] height) {
       // ptimisation 1
       // For each height I need wall on left and wall on right
       // I can, pre compute left and right highest for i (no need to run the inner loop)
       // Time complexity will reduce to O(n) from O(n2)
       // But will increase space complexity - O(n)
       // Water it will contribute = min(wall left, wall right) - height[i]

        int n = height.length;
        int res = 0;
    
        int [] leftWalls = new int[n];
        int [] rightWalls = new int[n];

        leftWalls[0] = height[0];
        rightWalls[n-1] = height[n-1];

        for (int i=1; i < n; i++) {
            leftWalls[i] = Math.max(leftWalls[i-1], height[i]);
        }

        for (int i=n-2; i >= 0; i--) {
            rightWalls[i] = Math.max(rightWalls[i+1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            int a = Math.min(leftWalls[i], rightWalls[i]) - height[i];
            // System.out.println(height[i]+ " "+a+" "+leftWalls[i]+" "+rightWalls[i]);
            res += a;
        }

        return res;
    }
}
