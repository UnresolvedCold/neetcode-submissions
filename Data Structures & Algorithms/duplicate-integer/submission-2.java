class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hist = new HashSet<>(nums.length);
        for (int num: nums) {
            if (hist.contains(num)) return true;

            hist.add(num);
        }

        return false;
    }
}