class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>(strs.length);

        for (String s: strs) {
            String hash = hash(s);
            hmap.computeIfAbsent(hash, ignored -> new ArrayList<>()).add(s);
        }

        List<List<String>> res = new ArrayList<>();

        for (Map.Entry<String, List<String>> e: hmap.entrySet()) {
            res.add(e.getValue());
        }

        return res;

    }

    public String hash(String s) {
        int [] freq = new int[26];

        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c-'a'] ++;
        }

        StringBuilder sb = new StringBuilder();
        for (int f: freq) {
            sb.append(f).append("-");
        }

        return sb.toString();
    }
}
