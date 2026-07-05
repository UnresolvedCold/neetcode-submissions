class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>(nums.length);

        for (int i=0; i < nums.length; i++) {
            int num = nums[i];

            if (hmap.containsKey(target - num)) {
                return new int[]{hmap.get(target-num), i};
            }

            hmap.put(num, i);
        }

        return new int[]{0,0};
    }
}
