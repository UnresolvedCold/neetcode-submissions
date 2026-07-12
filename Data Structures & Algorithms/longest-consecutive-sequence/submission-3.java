class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length <= 1) return nums.length;

        // map: num -> index
        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            hmap.putIfAbsent(nums[i], i);
        }

        // System.out.println(hmap.toString());

        // remove if num+1 does not exist at index j > i
        List<Integer> validStarters = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e: hmap.entrySet()) {
            int k = e.getKey();
            if (hmap.containsKey(k+1)) {
                validStarters.add(k);
            }
        }

        // System.out.println(validStarters);

        // largest lookup
        int res = 1;
        for (int k : validStarters) {
            int l = 1;
            while (hmap.containsKey(k+1)) {
                k = k+1;
                l++;
            }

            if (l > res) res = l;

        }

        return res;

    }
}
