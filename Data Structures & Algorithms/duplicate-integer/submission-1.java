class Solution {
    public boolean hasDuplicate(int[] nums) {
          Set<Integer> seen = java.util.concurrent.ConcurrentHashMap.newKeySet();

        return Arrays.stream(nums)
                .parallel()
                .anyMatch(num -> !seen.add(num));

    }
}