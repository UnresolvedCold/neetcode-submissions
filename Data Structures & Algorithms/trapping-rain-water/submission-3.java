class Solution {
    public int trap(int[] height) {
        // optimisation 2
        // Do I really need to calculate the leftWalls and rightWalls? Actually no
        // For any index i, I want to only know 2 things - walls on right and left
        // index 0 and index n-1 will never contribute anyting
        // For index 1, 
        // If height[1] > height[0] -> no water whatever wall is on right
        // If height[1] < height[0] -> then I just need one assurity that there exists atleast 1 r for which height[r] > height[0]
        // in that case water contribution of 1 is height[0] - height[1]
        // Similar logic goes for n-1 and n-2 index

        // Generalizing this, 
        // 2 pointers l, r
        // and leftMax, rightMax values
        // water contribution for index l = Min(leftMax, rightMax) - height[l]
        // water contribution for index r = Min(leftMax, rightMax) - height[r]
        // or more discretely
        // if leftMax > rightMax: 
        //      It gurantees there exists some left index > right index
        //      Does not matter what wall is on left, water contribution by r will be height[rightMax] - height[r]
        //      Can't say the same for left
        //      Keep looking for r till condition reverses
        // if leftMax < rightMax : Similar reasoning as above 

        int n = height.length;
        int res = 0;

        int l = 0;
        int r = n-1;
        int lm = 0;
        int rm = 0;

        while(l < r) {
            lm = Math.max(lm, height[l]);
            rm = Math.max(rm, height[r]);

            if (lm > rm) {
                res += rm - height[r];
                r--;
            } else {
                res += lm - height[l];
                l++;
            }
        }

        return res;
    }
}
