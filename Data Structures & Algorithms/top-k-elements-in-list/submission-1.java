class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // min heap and discard elements till you have k elements

        Map<Integer, Integer> m = new HashMap<>();

        for (int n: nums) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        List<int[]> l = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e: m.entrySet()) {
            l.add(new int[]{e.getKey(), e.getValue()});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));

        for (int[] n: l) {
            pq.add(n);
        }

        while (pq.size() > k) pq.poll();

        int i = 0; 
        int[] res = new int[k];

        while(pq.size() > 0) {
            int [] ee = pq.poll();
            res[i] = ee[0];
            i++;
        }


        return res;
    }
}
