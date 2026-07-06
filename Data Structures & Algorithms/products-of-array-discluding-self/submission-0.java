class Solution {
    public int[] productExceptSelf(int[] nums) {
        // follow up

        if (nums.length == 1) return nums;

        int [] pre = new int[nums.length];
        int [] post = new int[nums.length];

        int p = 1;
        int q = 1;
        for (int i=0; i < nums.length; i++) {
            int j = nums.length - i - 1;
            p = pre[i] = p * nums[i];
            q = post[j] = q * nums[j];
        }

        int [] res = new int[nums.length];

        res[0] = post[1];
        res[nums.length-1] = pre[nums.length-2];

        for (int i=1; i < nums.length-1; i++) {
            res[i] = pre[i-1] * post[i+1];
        }
        
        return res;
    
    }
}  
