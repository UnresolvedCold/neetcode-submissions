class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        // O(nlogn)
        Arrays.sort(nums);

        Set<List<Integer>> res = new HashSet<>();

        // O(n^2)
        for (int i=0; i<nums.length; i++) {
            int target = -1 * nums[i];

            // O(n)
            List<int[]> match = twoSum(nums, target, i+1, nums.length-1);
            if (!match.isEmpty()) {
                for (int[] m: match) {
                    res.add(List.of(nums[i], m[0], m[1]));
                }
            }
        }

        return new ArrayList<>(res);
    }

    private List<int[]> twoSum(int[] nums, int target, Integer s, Integer e) {
        if (s >= nums.length) return List.of();

        List<int[]> res = new ArrayList<>();

        while (e > s) {
            if (nums[s] + nums[e] == target) {
                res.add(new int[] {nums[s], nums[e]});

                s ++;
                e --;

                // Avoid duplicate here
                while(nums[s] == nums[s-1] && s < e) s++;
                while(s < e && nums[e] == nums[e+1]) e--;
            }

            if (nums[s] + nums[e] > target) {
                e --;
            }

            if (nums[s] + nums[e] < target) {
                s++;
            }
        }
        return res;
    }
}
